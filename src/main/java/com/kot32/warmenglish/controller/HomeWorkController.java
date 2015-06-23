package com.kot32.warmenglish.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.service.HomeworkService;
import com.kot32.warmenglish.util.AnswerFormatter;

/*
 * 负责作业发布一系列AJAX操作
 */
@Controller
@RequestMapping("/homework")
public class HomeWorkController {
	@Autowired
	HomeworkService homeworkService;

	@RequestMapping(value = "/list_classes", method = RequestMethod.GET)
	public void list_classes(HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		String classes = homeworkService.listClasses();
		response.getWriter().write(classes);
		response.getWriter().flush();

	}

	@RequestMapping(value = "/list_groups", method = RequestMethod.GET)
	public ModelAndView list_groups(HttpServletResponse response, int class_id)
			throws IOException {
		ModelAndView mv = new ModelAndView();
		ArrayList<com.kot32.warmenglish.domain.appPojo.Group> groups = homeworkService
				.listGroups(class_id);
		mv.addObject("groups", groups);
		return mv;
	}

	@RequestMapping(value = "/formatAnswer", method = RequestMethod.POST)
	public ModelAndView format_answer(String answer) {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> answers = AnswerFormatter.StringToAnswer(answer);
		mv.addObject("answers", answers);
		return mv;
	}

	@RequestMapping(value = "/addZuoye", method = RequestMethod.GET)
	public ModelAndView add_zuoye(String group_id, String des){
		ModelAndView mv = new ModelAndView();
		String uuid=homeworkService.addHomework(des, group_id);
		mv.addObject("status", "success");
		mv.addObject("uuid", uuid);
		return mv;
	}
	
	@RequestMapping(value = "/addxuanzeti", method = RequestMethod.GET)
	public ModelAndView add_xuanzeti(String homework_uuid, String tigan,String a,String b,String c,String d,String rightAnswer){
		ModelAndView mv = new ModelAndView();
		homeworkService.addSelectProbelm(homework_uuid,tigan,a,b,c,d,rightAnswer);		
		mv.addObject("status", "success");
		return mv;
	}
	
	@RequestMapping(value = "/addread", method = RequestMethod.GET)
	public ModelAndView addread(String homework_uuid,String content,HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		if(homeworkService.addRead(homework_uuid,content,req)){
			mv.addObject("status", "success");
		}else{
			mv.addObject("status", "error");
		}
		
		return mv;
	}

//	@RequestMapping(value = "/addcloze", method = RequestMethod.GET)
//	public ModelAndView addcloze(String homework_uuid,String content,HttpServletRequest req){
//		ModelAndView mv = new ModelAndView();
//		if(homeworkService.addCloze(homework_uuid,content,req)){
//			mv.addObject("status", "success");
//		}else{
//			mv.addObject("status", "error");
//		}
//		
//		return mv;
//	}
	
	@RequestMapping(value = "/addessay", method = RequestMethod.GET)
	public ModelAndView addessay(String homework_uuid,String content){
		ModelAndView mv = new ModelAndView();
		if(homeworkService.addEssay(homework_uuid,content)){
			mv.addObject("status", "success");
		}else{
			mv.addObject("status", "error");
		}
		
		return mv;
	}
}
