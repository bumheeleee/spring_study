package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoradServiceClient {

	public static void main(String[] args) {
		//1. spring 컨테이너를 구동한다.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring 컨테이너로부터  BoardServiceImpl객체를 lookUp한다.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3. 글 등록 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("첫번째 글입니다.");
		vo.setWriter("이범희");
		vo.setContent("실습 후 첫번째 글 작성입니다.");
		boardService.insertBoard(vo);
		
		//4. 글 목록 검색기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for(BoardVO board : boardList){
			System.out.println("===>" + board.toString());
		}
		
		container.close();

	}

}
