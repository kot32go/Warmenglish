package com.kot32.warmenglish.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 记录作文的答案（图片地址）
 * 
 * @author kot32
 *
 */
@Entity
@Table(name = "t_essay_answer")
public class EssayAnswer {
	@Id
	@GeneratedValue
	private int id;
	// 选择题
	@ManyToOne
	private EssayProblem essayProblem;
	@ManyToOne
	private Student student;
	//学生上传的答案（照片）地址
	private String essayAnswerFileName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EssayProblem getEssayProblem() {
		return essayProblem;
	}
	public void setEssayProblem(EssayProblem essayProblem) {
		this.essayProblem = essayProblem;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getEssayAnswerFileName() {
		return essayAnswerFileName;
	}
	public void setEssayAnswerFileName(String essayAnswerFileName) {
		this.essayAnswerFileName = essayAnswerFileName;
	}
	
}
