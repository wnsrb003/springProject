package kr.co.service;

import java.util.List;

import kr.co.vo.BoardVO;

public interface BoardService {

	// 寃뚯떆湲� �옉�꽦
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	
	
}