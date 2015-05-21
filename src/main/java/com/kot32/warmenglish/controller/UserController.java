package com.kot32.warmenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.UserException;
import com.kot32.warmenglish.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("logined_user")
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
	public String login(@Validated User user,BindingResult br,Model model) 
			throws UserException {
		if (br.hasErrors()) {
			return "/user/login";
		}
		User u=userService.login(user.getUsername(), user.getPassword());
		if(u!=null){
			model.addAttribute("logined_user", u);
			return "redirect:/control/index";
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

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Validated User user, BindingResult br)
			throws UserException {
		if (br.hasErrors()) {
			return "/user/register";
		}
		if (userService.register(user)) {
			System.out.println("注册成功");
			return "/user/login";
		} else {
			System.out.println("注册失败");
			return "/user/register";
		}

	}

}
