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

	@RequestMapping(value = "/add_homework", method = RequestMethod.GET)
	public void add_homework(String des, String group_id,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		response.setCharacterEncoding("utf-8");
		if (homeworkService.addHomework(des, group_id)) {
			response.getWriter().write("success");
		} else {
			response.getWriter().write("error");
		}
		response.getWriter().flush();

	}

	@RequestMapping(value = "/list_classes", method = RequestMethod.GET)
	public void list_classes(HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		String classes = homeworkService.listClasses();
		response.getWriter().write(classes);
		response.getWriter().flush();

	}

	@RequestMapping(value = "/list_groups", method = RequestMethod.GET)
	public ModelAndView list_groups(HttpServletResponse response,
			int class_id) throws IOException {
		ModelAndView mv = new ModelAndView();
		ArrayList<com.kot32.warmenglish.domain.appPojo.Group> groups = homeworkService.listGroups(class_id);
		mv.addObject("groups", groups);
		return mv;
	}
	
	@RequestMapping(value = "/formatAnswer", method = RequestMethod.POST)
	public ModelAndView format_answer(String answer)  {
		System.out.println("asd "+answer);
		ModelAndView mv = new ModelAndView();
		ArrayList<String> answers = AnswerFormatter.StringToAnswer(answer);
		mv.addObject("answers", answers);
		return mv;
	}
}
