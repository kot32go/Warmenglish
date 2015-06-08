package com.kot32.warmenglish.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kot32.warmenglish.dao.MessageDAO;
import com.kot32.warmenglish.domain.Class;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.ClassException;
import com.kot32.warmenglish.service.ClassService;
import com.kot32.warmenglish.service.MessageService;
import com.kot32.warmenglish.util.Const;
import com.tencent.xinge.XingeApp;

@Controller
@SessionAttributes("logined_user")
@RequestMapping("/control")
public class MainController {
	@Autowired
	ClassService classService;
	@Autowired
	MessageService messageService;

	private User logined_user;

	// 跳转到主页
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login(@ModelAttribute("logined_user") User user, Model model) {
		logined_user = user;
		return "/control/index";
	}

	// 跳转到增加班级页面
	@RequestMapping(value = "/add_class", method = RequestMethod.GET)
	public String add_class(Model model) {
		model.addAttribute("cla", new Class());
		return "/control/class/add_class";
	}

	// 增加班级的逻辑
	@RequestMapping(value = "/add_class", method = RequestMethod.POST)
	public String add_class(Model model, String className, String classDes)
			throws ClassException {

		Class clazz = new Class();
		clazz.setName(className);
		clazz.setDes(classDes);
		clazz.setUuid(UUID.randomUUID().toString().substring(0, 5));
		clazz.setUser(logined_user);

		// 还没写呢
		if (classService.addClass(logined_user, clazz)) {
			// 添加成功
			return "/success";
		} else {
			// 添加失败
			return "/control/class/add_class";
		}

	}

	// 跳转到设置班级页面
	@RequestMapping(value = "/set_class", method = RequestMethod.GET)
	public String set_class(Model model) {

		model.addAttribute("classes", logined_user.getClasses());
		return "/control/class/set_class";
	}

	// 跳转到发送通知页面的逻辑
	@RequestMapping(value = "/send_message", method = RequestMethod.GET)
	public String send_message(Model model) {

		model.addAttribute("classes", logined_user.getClasses());

		return "/control/message/send_message";
	}

	// 发送通知推送的逻辑
	@RequestMapping(value = "/send_message", method = RequestMethod.POST)
	public String send_message(String class_uuid, String title, String content) {
		if(messageService.sendMessage(logined_user,class_uuid, title, content)){
			return "/success";
		}
		return "/error";
	}

	// 跳转到成绩页面
	@RequestMapping(value = "/point", method = RequestMethod.GET)
	public String point(Model model) {
		return "/control/homework/point";
	}

	// 跳转到控制面板
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String jump() {

		return "/control/main";
	}

}
