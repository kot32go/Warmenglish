package com.kot32.warmenglish.controller;

import java.util.ArrayList;
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
import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.exception.ClassException;
import com.kot32.warmenglish.service.ClassService;
import com.kot32.warmenglish.service.HomeworkService;
import com.kot32.warmenglish.service.MessageService;
import com.kot32.warmenglish.util.Const;
import com.kot32.warmenglish.util.Global;
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
		Global.logined_user = user;
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
		model.addAttribute("classes", classService.listClass(logined_user));
		return "/control/class/set_class";
	}

	// 删除班级
	@RequestMapping(value = "/delete_class", method = RequestMethod.GET)
	public String delete_class(Model model, String uuid) {
		classService.deleteClass(uuid);
		model.addAttribute("classes", classService.listClass(logined_user));
		return "/control/class/set_class";
	}

	// 跳转到添加小组页面
	@RequestMapping(value = "/add_group", method = RequestMethod.GET)
	public String add_group(Model model) {
		model.addAttribute("classes", classService.listClass(logined_user));
		return "/control/class/add_group";
	}

	// 添加小组的逻辑
	@RequestMapping(value = "/add_group", method = RequestMethod.POST)
	public String add_group(String class_uuid, String name, String tips) {
		classService.addGroup(class_uuid, name, tips);
		return "/success";
	}

	// 跳转到设置小组页面
	@RequestMapping(value = "/set_group", method = RequestMethod.GET)
	public String set_group(Model model) {
		model.addAttribute("groups", classService.listAllGroup(logined_user));
		model.addAttribute("classes", logined_user.getClasses());
		return "/control/class/set_group";
	}

	// 根据所选班级列出小组
	@RequestMapping(value = "/set_group", method = RequestMethod.POST)
	public String list_group(Model model, String clazz) {
		model.addAttribute("classes", classService.listClass(logined_user));
		model.addAttribute("groups", classService.listGroup(clazz));
		return "/control/class/set_group";
	}

	// 跳转到发送通知页面的逻辑
	@RequestMapping(value = "/send_message", method = RequestMethod.GET)
	public String send_message(Model model) {
		model.addAttribute("classes", classService.listClass(logined_user));
		return "/control/message/send_message";
	}

	// 发送通知推送的逻辑
	@RequestMapping(value = "/send_message", method = RequestMethod.POST)
	public String send_message(String class_uuid, String title, String content) {
		if (messageService
				.sendMessage(logined_user, class_uuid, title, content)) {
			return "/success";
		}
		return "/error";
	}

	// 跳转到通知列表页面并列出所有通知
	@RequestMapping(value = "/list_message", method = RequestMethod.GET)
	public String jump_list_message(Model model) {
		model.addAttribute("messages",
				messageService.listAllMessages(logined_user));
		model.addAttribute("classes", logined_user.getClasses());
		return "/control/message/list_message";
	}

	// 列出指定某个班级的通知列表的逻辑
	@RequestMapping(value = "/list_message", method = RequestMethod.POST)
	public String list_message(Model model, String class_uuid) {
		model.addAttribute("classes", logined_user.getClasses());
		model.addAttribute("messages", messageService.listMessages(class_uuid));
		return "/control/message/list_message";
	}

	// 跳转到成绩页面
	@RequestMapping(value = "/grade", method = RequestMethod.GET)
	public String point(Model model) {
		model.addAttribute("classes",  classService.listClass(logined_user));
		return "/control/homework/grade";
	}

	// 跳转到发布作业页面
	@RequestMapping(value = "/homework", method = RequestMethod.GET)
	public String jumptohomework(Model model) {
		model.addAttribute("classes", classService.listClass(logined_user));
		return "/control/homework/homework";
	}

	// 跳转到打分页面
	@RequestMapping(value = "/mark", method = RequestMethod.GET)
	public String mark(Model model) {
		return "/control/homework/mark";
	}

	// 跳转到控制面板
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String jump(Model model,String type) {
		model.addAttribute("type", "../control/"+type);
		return "/control/main";
	}
}
