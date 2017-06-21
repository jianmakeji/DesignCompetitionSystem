package com.jianma.design.service;

import java.util.List;

import com.jianma.design.model.Stage;

public interface StageService {

	public void createStage(Stage stage);
	
	public void updateStage(Stage stage);
	
	public void deleteStage(int id);
	
	public List<Stage> getAllStage();
}
