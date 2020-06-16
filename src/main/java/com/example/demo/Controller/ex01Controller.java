package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class ex01Controller {

	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	@RequestMapping("/input-name")
	public String inputName(String name,Model model){
		model.addAttribute("name",name);
		System.out.println(name);
		return "exam01-result";
	}
}
