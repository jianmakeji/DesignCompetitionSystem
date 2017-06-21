package com.jianma.design.dao;

import java.util.List;

import com.jianma.design.model.Stage;

public interface StageDao {

	public void createStage(Stage stage);
	
	public void updateStage(Stage stage);
	
	public void deleteStage(int id);
	
	public List<Stage> getAllStage();
}
