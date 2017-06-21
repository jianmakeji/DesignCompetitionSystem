package com.jianma.design.service;

import java.util.List;

import com.jianma.design.model.Group;

public interface GroupService {

	public void createGroup(Group group);
	
	public void deleteGroup(int id);
	
	public void updateGroup(Group group);
	
	public List<Group> getAllGroup();
}
