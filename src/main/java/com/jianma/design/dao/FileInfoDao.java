package com.jianma.design.dao;

import java.util.List;

import com.jianma.design.model.FileInfo;


public interface FileInfoDao {
	
	public void createFile(FileInfo file);
	
	public void deleteFile(int id);
	
	public void updateFile(FileInfo file);
	
	public List<FileInfo> getAllFile();
	
	public List<FileInfo> getFileByType(int type);
}
