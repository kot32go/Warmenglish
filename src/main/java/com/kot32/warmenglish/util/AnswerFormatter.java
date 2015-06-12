package com.kot32.warmenglish.util;

import java.util.ArrayList;

public class AnswerFormatter {
	public static ArrayList<String> StringToAnswer(String problem) {
		problem = problem.trim();
		String[] answer = problem.split("[A-Z]\\.");
		// 去除空格，以及其他字符
		answer = formatAnswer(answer);
		// 如果结果有误，那么重新解析
		if (answer.length != 4) {
			answer = formatAnswer(problem.split("[a-z]\\."));
		}
		if (answer.length != 4) {
			answer = formatAnswer(problem.split("\\(.*?[A-Z].*?\\)"));
		}
		ArrayList<String> tmp = new ArrayList<String>();
		for (String s : answer) {
			tmp.add(s);
		}
		return tmp;
	}

	public static String[] formatAnswer(String[] answer) {
		
		ArrayList<String> tmp = new ArrayList<String>();
		for (String s : answer) {
			s = s.replace('.', ' ');
			s = s.trim();
			tmp.add(s);
		}
		tmp.remove("");
		answer = (String[]) tmp.toArray(new String[tmp.size()]);
		return answer;
	}
}
