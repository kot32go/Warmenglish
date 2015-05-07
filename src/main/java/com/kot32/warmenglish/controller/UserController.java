package com.kot32.warmenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.UserException;
import com.kot32.warmenglish.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	// 登录
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "/user/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Validated User user,BindingResult br) throws UserException {
		if (br.hasErrors()) {
			return "/user/login";
		}
		if(userService.login(user.getUsername(), user.getPassword())){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		return "/user/login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "/user/register";
	}
}
