package com.cos.blogapp.test;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class HashTest {
	
	@Test
	public void hashTest1() {
		HashMap<String, String> model = new HashMap<>();
		model.put("boardEntity", "보드엔티티");
		
		System.out.println(model.get("boardEntity"));
	}
}
