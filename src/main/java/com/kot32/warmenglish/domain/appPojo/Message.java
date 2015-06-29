package com.kot32.warmenglish.domain.appPojo;

import java.util.Date;

public class Message {
	public int id;
	public String title;
	public String content;
	public Date date;
	
	public static Message copyFromMessage(com.kot32.warmenglish.domain.Message m){
		Message message=new Message();
		message.id=m.getId();
		message.title=m.getTitle();
		message.content=m.getContent();
		message.date=m.getDate();
		return message;
	}
}
