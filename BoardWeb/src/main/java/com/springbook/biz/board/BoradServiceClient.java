package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoradServiceClient {

	public static void main(String[] args) {
		//1. spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring �����̳ʷκ���  BoardServiceImpl��ü�� lookUp�Ѵ�.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3. �� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setTitle("ù��° ���Դϴ�.");
		vo.setWriter("�̹���");
		vo.setContent("�ǽ� �� ù��° �� �ۼ��Դϴ�.");
		boardService.insertBoard(vo);
		
		//4. �� ��� �˻���� �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for(BoardVO board : boardList){
			System.out.println("===>" + board.toString());
		}
		
		container.close();

	}

}
