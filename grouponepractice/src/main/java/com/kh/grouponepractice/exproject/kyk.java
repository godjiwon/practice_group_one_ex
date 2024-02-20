package com.kh.grouponepractice.exproject;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
public class kyk {
	public String join() {
		return "/WEB-INF/views/member/join.jsp";
	}
}
