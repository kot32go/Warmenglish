package com.kot32.warmenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kot32.warmenglish.service.ClassService;


/*
 * 负责组员一系列AJAX操作
 */
@Controller
@RequestMapping("/set_group")
public class GroupController {
	@Autowired
	ClassService classService;
	
	@RequestMapping(value = "/list_members", method = RequestMethod.GET)
	public void list_members(Model model,int group_id){
		model.addAttribute("students", classService.list_members(group_id));
	}
}
