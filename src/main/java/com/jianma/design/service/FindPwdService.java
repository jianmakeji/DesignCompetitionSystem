package com.jianma.design.service;


import com.jianma.design.model.FindPwd;

public interface FindPwdService {

	public int createFindPwd(FindPwd findPwd);
	
	public int getFindPwdByCondition(String email, String validCode, int id);
}
