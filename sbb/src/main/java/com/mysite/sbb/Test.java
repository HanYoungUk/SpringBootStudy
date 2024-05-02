package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Test 클래스가 컨트롤러의 기능을 수행함
public class Test {

	@GetMapping("/hello") // hello 메소드가 실행됨
	@ResponseBody // hello 메서드의 출력값을 그대로 리턴함
	public String hello() {
		return "Hello YoungUk";
	}
	
}
	

