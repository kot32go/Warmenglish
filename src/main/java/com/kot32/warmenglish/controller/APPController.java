package com.kot32.warmenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.exception.UserException;
import com.kot32.warmenglish.service.APPService;

@Controller
@RequestMapping("/app")
public class APPController {
	@Autowired
	APPService service;

	// 注册
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(String username, String password) {
		
		// 暂时不设置其他属性
		Student student = new Student();
		student.setUsername(username);
		student.setPassword(password);

		ModelAndView mv = new ModelAndView();
		try {
			if (service.register(student)) {
				mv.addObject("result", "success");
			} else {
				mv.addObject("result", "error");
			}
		} catch (Exception e) {
			mv.addObject("result", "error");
		}
		return mv;
	}

	// 登录
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(String username, String password) {
		System.out.println("登录");
		ModelAndView mv = new ModelAndView();
		Student student=null;
		try {
			student=service.login(username, password);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(null==student){
			mv.addObject("status","error");
		}else{
			mv.addObject("status","success");
		}
		mv.addObject("student",student);
		
		return mv;
	}

}
