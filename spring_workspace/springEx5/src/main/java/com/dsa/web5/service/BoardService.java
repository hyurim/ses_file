package com.dsa.web5.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;

import jakarta.servlet.http.HttpServletResponse;

public interface BoardService {

	void write(BoardDTO boardDTO, String uploadPath, MultipartFile upload) throws IOException;

	List<BoardDTO> selectAllData();

	BoardDTO getBoard(int boardNum);

	void download(Integer boardNum, HttpServletResponse response, String uploadPath);

	void likeplus(Integer boardNum);

	BoardDTO selectBoard(Integer boardNum);

	void updateBoard(BoardDTO board, String uploadPath, MultipartFile upload);

}
