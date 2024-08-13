package com.dsa.web5.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
	// 리플 일련번호
	private Integer replyNum;
	// 게시글 번호
	private Integer boardNum;
	// 작성자 아이디
	private String memberId;
	// 작성자 이름
	private String memberName;
	// 리플 내요ㅕㅇ
	private String contents;
	// 작성 시간
	private LocalDateTime createDate;
}
