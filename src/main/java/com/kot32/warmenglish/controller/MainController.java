package com.kot32.warmenglish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.User;


@Controller
@SessionAttributes("logined_user")
@RequestMapping("/control")
public class MainController {
	//跳转到主页
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login(@ModelAttribute("logined_user")User user,Model model) {
		
		return "/control/index";
	}
	
	//增加班级
	@RequestMapping(value = "/add_class", method = RequestMethod.GET)
	public String add_class(Model model){
		model.addAttribute("cla", new Class());
		return "/control/class/add_class";
	}
	
	//跳转到控制面板
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String jump() {
		
		return "/control/main";
	}
	
}
