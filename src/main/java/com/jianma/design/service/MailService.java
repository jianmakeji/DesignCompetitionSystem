package com.jianma.design.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import com.jianma.design.model.MailBean;

public interface MailService {

	public void sendMail(MailBean mailBean) throws MessagingException, UnsupportedEncodingException;
	 
}
