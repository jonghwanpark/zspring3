package org.joywins.service;

import java.util.List;

import javax.inject.Inject;

import org.joywins.dao.IF_BoardDAO;
import org.joywins.domain.BoardVO;
import org.joywins.domain.Criteria;
import org.springframework.stereotype.Service;

//...188p.@Service가 스프링의 빈으로 인식하게 함. root-context.xml::Beans Graph 확인할 것.
@Service
public class BoardServiceImpl implements IF_BoardService {

	@Inject
	private IF_BoardDAO dao;

	@Override
	public void insert(BoardVO board) throws Exception {
		dao.insert(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void update(BoardVO board) throws Exception {
		dao.update(board);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

	/*
	 * ...261p. 스프링MVC는 파라미터를 수집하는 기능이 강력해서 여러 종류의 필요한 데이터를
	 * ...하나의 클래스로 구성해도 작업 양이 많이 늘지 않고, 작성한 파라미터용 클래스 역시
	 * ...필요한 경우 확장해서 사용할 수 있다.
	 * @see org.joywins.service.IF_BoardService#listCriteria(org.joywins.domain.Criteria)
	 */
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int countBno(Criteria cri) throws Exception {
		return dao.countBno(cri);
	}



}
