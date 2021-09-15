package com.cos.blogapp.handler;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.blogapp.util.Script;

// @ControllerAdvice 이친구는 1. 익셉션 핸들링, 2. @Controller 의 역할까지 한다.
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NoSuchElementException.class)
	public @ResponseBody String error1(NoSuchElementException e) {
		System.out.println("오류 터졌어 : "+e.getMessage());
		return Script.href("/", "게시글 id를 찾을 수 없습니다.");
	}
}
