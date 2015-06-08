package com.kot32.warmenglish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kot32.warmenglish.dao.MessageDAO;
import com.kot32.warmenglish.domain.User;
import com.kot32.warmenglish.util.Const;
import com.tencent.xinge.XingeApp;

@Service
public class MessageService {
	@Autowired
	MessageDAO messageDAO;
	@Transactional
	public boolean sendMessage(User teacher ,String class_uuid, String title,String content){		
		return messageDAO.sendMessage(teacher,class_uuid, title, content);
	}
}
