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
		Student student = null;
		try {
			student = service.login(username, password);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (null == student) {
			mv.addObject("status", "error");
		} else {
			mv.addObject("status", "success");
		}
		com.kot32.warmenglish.domain.appPojo.Student student2 = com.kot32.warmenglish.domain.appPojo.Student.copyFromStudent(student);
		mv.addObject("student", student2);
		return mv;
	}

	@RequestMapping(value = "/query_class", method = RequestMethod.GET)
	public ModelAndView query_class(String class_uuid) {
		ModelAndView mv = new ModelAndView();
		String class_name = service.query_class(class_uuid);
		if (null == class_name) {
			mv.addObject("result", "error");
		} else {
			mv.addObject("result", class_name);
		}

		return mv;
	}

	@RequestMapping(value = "/update_info", method = RequestMethod.GET)
	public ModelAndView update_info(String student_id, String class_uuid,
			String email) {
		ModelAndView mv = new ModelAndView();
		if (service.updateInfo(student_id, class_uuid, email)) {
			mv.addObject("result", "success");
		} else {
			mv.addObject("result", "error");
		}
		return mv;
	}

}
