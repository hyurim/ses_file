package com.dsa.web5.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dsa.web5.entity.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer>{
	// 전달된 문자열을 제목에서 검색한 후 지정한 페이지 분량 리턴
	 Page<BoardEntity> findByTitleContaining(String title, Pageable pageable);

	// 전달된 문자열을 본문에서 검색한 후 지정한 페이지 분량 리턴
	Page<BoardEntity> findByContentsContaining(String searchWord, Pageable pageable);

	// 전달된 문자열을 작성자 아이디에서 검색한 후 지정한 페이지 분량 리턴
	Page<BoardEntity> findByMemberId_MemberId(String memberId, Pageable pageable);

	// 전체 검색으로 1페이지 분량 리턴
	Page<BoardEntity> findByTitleContainingOrContentsContainingOrMemberId_MemberIdContaining(
           String title, String contents, String memberId, Pageable pageable);

	// all 카테고리를 선택할 경우 JPQL
	@Query("SELECT board " + 
		       "FROM BoardEntity board " +
		       "WHERE board.title LIKE %:searchWord% " +
		       "   OR board.contents LIKE %:searchWord% " +
		       "   OR board.memberId.memberId LIKE %:searchWord% " +
		       "ORDER BY board.boardNum DESC")
	Page<BoardEntity> searchAll(@Param("searchWord") String searchWord, Pageable pageable);

}
