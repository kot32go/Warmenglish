package com.kot32.warmenglish.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kot32.warmenglish.domain.Group;
import com.kot32.warmenglish.domain.Homework;
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
	public ModelAndView format_answer(String answer)
			throws UnsupportedEncodingException {
		ModelAndView mv = new ModelAndView();
		answer = URLDecoder.decode(answer, "UTF-8");
		ArrayList<String> answers = AnswerFormatter.StringToAnswer(answer);
		mv.addObject("answers", answers);
		return mv;
	}

	@RequestMapping(value = "/addZuoye", method = RequestMethod.GET)
	public ModelAndView add_zuoye(String group_id, String des) throws UnsupportedEncodingException {
		ModelAndView mv = new ModelAndView();
		des=URLDecoder.decode(des,"UTF-8");
		String uuid = homeworkService.addHomework(des, group_id);
		mv.addObject("status", "success");
		mv.addObject("uuid", uuid);
		return mv;
	}

	@RequestMapping(value = "/addxuanzeti", method = RequestMethod.GET)
	public ModelAndView add_xuanzeti(String homework_uuid, String tigan,
			String a, String b, String c, String d, String rightAnswer)
			throws UnsupportedEncodingException {
		ModelAndView mv = new ModelAndView();
		a = URLDecoder.decode(a, "UTF-8");
		b = URLDecoder.decode(b, "UTF-8");
		c = URLDecoder.decode(c, "UTF-8");
		d = URLDecoder.decode(d, "UTF-8");
		tigan = URLDecoder.decode(tigan, "UTF-8");
		rightAnswer = URLDecoder.decode(rightAnswer, "UTF-8");
		homeworkService.addSelectProbelm(homework_uuid, tigan, a, b, c, d,
				rightAnswer);
		mv.addObject("status", "success");
		return mv;
	}

	@RequestMapping(value = "/addread", method = RequestMethod.GET)
	public ModelAndView addread(String homework_uuid, String content,
			HttpServletRequest req) throws UnsupportedEncodingException {
		ModelAndView mv = new ModelAndView();
		content = URLDecoder.decode(content, "UTF-8");
		if (homeworkService.addRead(homework_uuid, content, req)) {
			mv.addObject("status", "success");
		} else {
			mv.addObject("status", "error");
		}

		return mv;
	}

	// @RequestMapping(value = "/addcloze", method = RequestMethod.GET)
	// public ModelAndView addcloze(String homework_uuid,String
	// content,HttpServletRequest req){
	// ModelAndView mv = new ModelAndView();
	// if(homeworkService.addCloze(homework_uuid,content,req)){
	// mv.addObject("status", "success");
	// }else{
	// mv.addObject("status", "error");
	// }
	//
	// return mv;
	// }

	@RequestMapping(value = "/addessay", method = RequestMethod.GET)
	public ModelAndView addessay(String homework_uuid, String content)
			throws UnsupportedEncodingException {
		content = URLDecoder.decode(content, "UTF-8");
		System.out.println(content);
		System.out.println(homework_uuid);
		ModelAndView mv = new ModelAndView();
		if (homeworkService.addEssay(homework_uuid, content)) {
			mv.addObject("status", "success");
		} else {
			mv.addObject("status", "error");
		}

		return mv;
	}

	// 列出作业列表
	@RequestMapping(value = "/list_homeworks", method = RequestMethod.GET)
	public ModelAndView list_homeworks(int group_id)
			throws UnsupportedEncodingException {
		ModelAndView mv = new ModelAndView();
		List<Homework> homeworks = homeworkService.listHomeworks(group_id);
		mv.addObject("homeworks", homeworks);
		return mv;
	}

	// 给作文打分
	@RequestMapping(value = "/essayDafen", method = RequestMethod.GET)
	public ModelAndView dafen(String homeworkuuid,int studentid,String fenshu) {
		ModelAndView mv = new ModelAndView();
		System.out.println(homeworkuuid);
		System.out.println(studentid);
		System.out.println(fenshu);
		homeworkService.dafen(homeworkuuid,studentid,Float.parseFloat(fenshu));
		mv.addObject("status","success");
		return mv;
	}

}
