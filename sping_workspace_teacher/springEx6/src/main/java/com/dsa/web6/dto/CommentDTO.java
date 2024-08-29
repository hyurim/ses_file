package com.dsa.web6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 댓글 정보 DTO
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
	Integer num;
	String name;
	String comment;
}
