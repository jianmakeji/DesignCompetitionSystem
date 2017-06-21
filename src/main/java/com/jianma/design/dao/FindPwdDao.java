package com.jianma.design.dao;

import java.util.Optional;

import com.jianma.design.model.FindPwd;

public interface FindPwdDao {

	public int createFindPwd(FindPwd findPwd);
	
	public Optional<FindPwd> getFindPwdByCondition(String email, String validCode);
	
	public Optional<FindPwd> getFindPwdById(int id);
}
