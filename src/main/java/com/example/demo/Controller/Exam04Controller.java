package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {

	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();

	}
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	@RequestMapping("/input-user")
	public String inputUser(UserForm userForm) {
		System.out.println(userForm.getName());
		System.out.println(userForm.getAge());
		System.out.println(userForm.getComment());
		return "exam04-result";
	}
}
