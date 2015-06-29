package com.kot32.warmenglish.domain.appPojo;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class EssayProblem {
	public int id;
	// 题干
	public String des;
	public String studentAnswerURL;
	public int homework_id;
	public static EssayProblem copyFromEssay(
			com.kot32.warmenglish.domain.EssayProblem e) {
		EssayProblem essayProblem = new EssayProblem();
		essayProblem.id = e.getId();
		essayProblem.des = e.getDes();
		essayProblem.homework_id=e.getHomework().getId();
		return essayProblem;
	}
}
