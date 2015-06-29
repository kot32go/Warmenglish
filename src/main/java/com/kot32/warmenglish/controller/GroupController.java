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
	
	@RequestMapping(value = "/list_unmembers", method = RequestMethod.GET)
	public void list_unmembers(Model model,int clazz_id){
		model.addAttribute("students", classService.list_unmembers(clazz_id));
	}
	
	@RequestMapping(value = "/delete_members", method = RequestMethod.GET)
	public void delete_members(Model model,String json,int clazz_id){
		json=json.substring(1,json.length()-1);
		System.out.println("删除"+json);
		if(json.contains("*")){
			String[] js=json.split("\\*");
			int[] student_id=new int[js.length];
			for(int i=0;i<js.length;i++){
				if(js[i].equals("")) continue;
				student_id[i]=Integer.parseInt(js[i].trim());
			}
			classService.delete_members(student_id, clazz_id);
		}else{
			int []student_id=new int[1];
			student_id[0]=Integer.parseInt(json);
			classService.delete_members(student_id, clazz_id);
		}
		
		// return "redirct:/control/class/set_group";
	}
	
	@RequestMapping(value = "/add_members", method = RequestMethod.GET)
	public void add_members(Model model,String json,int group_id){
		json=json.substring(1,json.length()-1);
		System.out.println("添加:"+json);
		if(json.contains("*")){
			String[] js=json.split("\\*");
			int[] student_id=new int[js.length];
			for(int i=0;i<js.length;i++){
				if(js[i].equals("")) continue;
				student_id[i]=Integer.parseInt(js[i].trim());
			}
			classService.add_members(student_id, group_id);
		}else{
			int []student_id=new int[1];
			student_id[0]=Integer.parseInt(json);
			classService.add_members(student_id,group_id);
		}
		//return "/control/class/set_group";
	}
}
