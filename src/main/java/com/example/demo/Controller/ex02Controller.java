package com.example.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class ex02Controller {

	@Autowired
	private HttpSession session;
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	@RequestMapping("input-number")
	public String inputNumber(Integer num1, Integer num2) {
		session.setAttribute("num1",num1);
		session.setAttribute("num2",num2);
		session.setAttribute("answer", num1+num2);
		return "exam02-result";
	}
	@RequestMapping("/toNextPage")
	public String toNextPage() {
		return "exam02-result2";
	}
}
