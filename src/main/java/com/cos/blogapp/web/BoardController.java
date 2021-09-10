package com.cos.blogapp.web;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.blogapp.domain.board.Board;
import com.cos.blogapp.domain.board.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller // 컴퍼넌트 스캔 (스프링) IoC
public class BoardController {

	private final BoardRepository boardRepository;

	@GetMapping("/board")
	public String home(Model model, int page) {
		
		PageRequest pageRequest = PageRequest.of(page, 3, Sort.by(Sort.Direction.DESC, "id"));

		Page<Board> boardsEntity = 
				boardRepository.findAll(pageRequest);
		model.addAttribute("boardsEntity", boardsEntity);
		//System.out.println(boardsEntity.get(0).getUser().getUsername());
		return "board/list";
	}
}
