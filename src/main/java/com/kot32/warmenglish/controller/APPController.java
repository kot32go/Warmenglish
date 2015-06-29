package com.kot32.warmenglish.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.kot32.warmenglish.domain.EssayProblem;
import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.domain.appPojo.Homework;
import com.kot32.warmenglish.domain.appPojo.Message;
import com.kot32.warmenglish.domain.appPojo.SelectProblem;
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
		com.kot32.warmenglish.domain.appPojo.Student student2 = com.kot32.warmenglish.domain.appPojo.Student
				.copyFromStudent(student);
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

	// 列出指定学生的家庭作业
	@RequestMapping(value = "/list_homework", method = RequestMethod.GET)
	public ModelAndView list_homeworks(String student_id,
			HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		ArrayList<Homework> homeworks = service.listHomeworks(student_id);
		mv.addObject("homeworks", homeworks);
		return mv;
	}

	// 列出指定学生的推送消息
	@RequestMapping(value = "/list_message", method = RequestMethod.GET)
	public ModelAndView list_messages(String student_id,
			HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		ArrayList<Message> messages = service.listMessage(student_id);
		mv.addObject("messages", messages);
		return mv;
	}

	// 根据给出的homework uuid列出选择题
	@RequestMapping(value = "/list_select", method = RequestMethod.GET)
	public ModelAndView list_select(String uuid, HttpServletResponse response)
			throws IOException {
		ModelAndView mv = new ModelAndView();
		List<SelectProblem> selectProblems = service.listSelects(uuid);
		mv.addObject("selects", selectProblems);
		return mv;
	}

	// 学生提交某次作业选择题的答案
	@RequestMapping(value = "/submit_selectProblemAnswer", method = RequestMethod.GET)
	public ModelAndView submitSelectProblemAnswer(String student_id,
			String selectProblemJson) {
		List<SelectProblem> selectProblems = new ArrayList<SelectProblem>();
		// 将传来的JSON解析出对象
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray Jarray = parser.parse(selectProblemJson).getAsJsonArray();
		for (JsonElement obj : Jarray) {
			SelectProblem cse = gson.fromJson(obj, SelectProblem.class);
			selectProblems.add(cse);
		}
		// 将此次答案保存
		service.submitSelectProblemAnswer(student_id, selectProblems);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", "success");
		return mv;
	}

	// 根据给出的homework uuid列出选择题
	@RequestMapping(value = "/list_essay", method = RequestMethod.GET)
	public ModelAndView list_essay(String uuid) {
		ModelAndView mv = new ModelAndView();
		com.kot32.warmenglish.domain.appPojo.EssayProblem essayProblem = service
				.listEssay(uuid);
		mv.addObject("essay", essayProblem);
		return mv;
	}

	// 上传作文答案
	@RequestMapping(value = "/submit_essayProblemAnswer", method = RequestMethod.POST)
	public ModelAndView submitEssayProblemAnswer(String student_id,
			String essayProblemJson, MultipartFile attach,
			HttpServletRequest request) {
		com.kot32.warmenglish.domain.appPojo.EssayProblem appEssay=new Gson().fromJson(essayProblemJson, com.kot32.warmenglish.domain.appPojo.EssayProblem.class);
		String realPath = request.getSession().getServletContext()
				.getRealPath("/resources/upload");
		String url = UUID.randomUUID().toString().substring(0, 5);
		File file = new File(realPath + "/" + url + ".jpg");
		try {
			FileUtils.copyInputStreamToFile(attach.getInputStream(), file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 给数据库保存
		service.submitEssayProblemAnswer(appEssay,student_id,url);
		// 先接受图片，再生成图片uuid，再保存答案数据
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
