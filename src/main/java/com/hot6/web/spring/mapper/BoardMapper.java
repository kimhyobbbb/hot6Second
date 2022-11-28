package com.hot6.web.spring.mapper;

//<<<<<<< HEAD
//import com.example.app.domain.vo.BoardDTO;
//import com.example.app.domain.vo.BoardVO;
//import com.example.app.domain.vo.Criteria;
//=======

import com.hot6.web.spring.domain.vo.BoardVO;
//>>>>>>> 079a339145ff678f3a47606dc1f9b41c36adc3a8
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
//<<<<<<< HEAD
////    추가
    public void insert(BoardVO boardVO);
////    수정
    public void update(BoardVO boardVO);
////    삭제 // 도희정 바보
    public void delete(Long boardNumber);
////    조회
//    public BoardVO select(Long boardNumber);
////    전체 조회
//    public List<BoardVO> selectAll(Criteria criteria);
////    전체 개수
//=======
//    추가
//    public void insert(BoardDTO boardDTO);

//    수정
//    public void update(BoardDTO boardDTO);

//    삭제
//    public void delete(Long boardNumber);

//    조회
    public BoardVO select(Long boardNumber);

//    전체 조회
    public List<BoardVO> selectAll();

//    전체 개수
//>>>>>>> 079a339145ff678f3a47606dc1f9b41c36adc3a8
    public int getTotal(Long boardNumber);

}
