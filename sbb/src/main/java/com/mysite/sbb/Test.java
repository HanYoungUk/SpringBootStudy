package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Test Ŭ������ ��Ʈ�ѷ��� ����� ������
public class Test {

	@GetMapping("/hello") // hello �޼ҵ尡 �����
	@ResponseBody // hello �޼����� ��°��� �״�� ������
	public String hello() {
		return "Hello YoungUk";
	}
	
}
	

