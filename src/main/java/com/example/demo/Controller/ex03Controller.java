package com.example.demo.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class ex03Controller {
	@Autowired
	private ServletContext application;
	@RequestMapping("")
	public String index() {
		System.out.println("ここまできた");
		return "exam3";
	}
	@RequestMapping("/calc")
	public String calc(int num1, int num2, int num3) {
		application.setAttribute("num1", num1);
		application.setAttribute("num2", num2);
		application.setAttribute("num3", num3);
		application.setAttribute("calc1", num1+num2+num3);
		application.setAttribute("calc2", (num1+num2+num3)*1.1 );
		return "exam3-result";
	}
}
