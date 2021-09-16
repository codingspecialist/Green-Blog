package com.cos.blogapp.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.blogapp.handler.ex.MyNotFoundException;
import com.cos.blogapp.util.Script;

// @ControllerAdvice 이친구는 1. 익셉션 핸들링, 2. @Controller 의 역할까지 한다.
@ControllerAdvice
public class GlobalExceptionHandler {

	// 어떤 익셉션은 파일~~~
	// 어떤 익셉션은 데이터~~~
	// 어떤 익셉션은 뒤로 가기
	// 어떤 익셉션은 / 메인 페이지로 가게!!
	
	@ExceptionHandler(value = MyNotFoundException.class)
	public @ResponseBody String error1(MyNotFoundException e) {
		System.out.println("오류 터졌어 : "+e.getMessage());
		return Script.href("/", e.getMessage());
	}
	
	
}
