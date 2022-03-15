package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.Controller;

public class UpdateBoardController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("�� ���� ó��");
		
		// 1. ����� �Է� ���� ����
		//request.setCharacterEncoding("EUC-KR");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String seq = request.getParameter("seq");

		// 2. DB ���� ó��
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setSeq(Integer.parseInt(seq));
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);

		// 3. ȭ�� �׺���̼�
		// �� ���� ���� �Ŀ� �� ����� �ٽ� �˻��Ͽ� ��� ȭ���� �����ؾ��ϹǷ� getBoardList.do�� �����Ѵ�.
		return "getBoardList.do";
	}
	
	

}
