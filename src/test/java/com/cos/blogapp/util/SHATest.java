package com.cos.blogapp.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

public class SHATest {

	@Test
	public void encrypt() {
		String salt = "코스";
		String rawPassword = "1234!"+salt;
		
		// 1. SHA256 함수를 가진 클래스 객체 가져오기
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. 비밀번호 1234 -> SHA256 던지기
		md.update(rawPassword.getBytes());
		
//		for(Byte b : rawPassword.getBytes()) {
//			System.out.print(b);
//		}
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		for(Byte b : md.digest()) {
			sb.append(String.format("%02x", b));
		}
		System.out.println(sb.toString());
		System.out.println(sb.toString().length());
		
	}
}
