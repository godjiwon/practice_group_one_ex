package com.kh.grouponepractice.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {
	
	@RequestMapping("/testPage")
	public String testPage() {
		return "테스트용 1 홈페이지 만들기...ㅠㅠ";
	}
		
}
