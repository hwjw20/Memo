package com.jiwon.memo.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {

	// 암호화 기능
	// 암호화하고 싶은 message를 전달 받아서 16진수의 숫자를 문자형태로 리턴한다.
	// static은 멤버변수 없이 메소드만 활용할때 객체 생성 없이 메소드 바로 호출해서 사용 가능하다.
	public static String md5(String message) {
		String resultData = "";
		
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			
			byte[] bytes = message.getBytes();
			md.update(bytes);
			
			byte[] digest = md.digest(); // 암호화된 결과
			
			// 16진수 형태의 문자열로 변환
			for(int i = 0; i < digest.length; i++) {
				resultData += Integer.toHexString(digest[i] & 0xff);
			}
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return resultData;
	}
	
}
