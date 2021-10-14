package com.cos.blogapp.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cos.blogapp.handler.SessionInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	public WebMvcConfig() {
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionInterceptor())
			.addPathPatterns("/api/**");
	}
	
}
