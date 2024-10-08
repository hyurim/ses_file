package com.dsa.web5.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dsa.web5.entity.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {

	// 전달된 문자열을 제목에서 검색한 후 지정한 페이지 분량 리턴
	Page<BoardEntity> findByTitleContaining
		(String searchWord, Pageable pageable);

	// 전달된 문자열을 본문에서 검색한 후 지정한 페이지 분량 리턴
	Page<BoardEntity> findByContentsContaining
		(String searchWord, Pageable pageable);

	// 전달된 문자열을 작성자 아이디에서 검색한 후 지정한 페이지 분량 리턴
	Page<BoardEntity> findByMember_MemberId
		(String searchWord, Pageable pageable);

	// 전체 검색으로 1페이지 분량 리턴
	Page<BoardEntity> findByTitleContainingOrContentsContainingOrMemberMemberIdContaining
		(String searchWord, String searchWord2, String searchWord3, Pageable pageable);

	
	// JPQL을 통해 아이디에서 검색 후 페이지 분량 리턴
	@Query("SELECT b FROM BoardEntity b "
		 + "WHERE b.member.memberId LIKE %:searchWord% ")
	Page<BoardEntity> selectMemberId(@Param("searchWord") String searchWord
			, Pageable pageable);

	
	
}
