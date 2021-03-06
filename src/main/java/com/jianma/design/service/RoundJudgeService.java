package com.jianma.design.service;

import com.jianma.design.model.RoundJudge;
import com.jianma.design.model.RoundJudgeListModel;

public interface RoundJudgeService {

	public void createRoundJudge(RoundJudge roundJudge);
	
	public void updateRoundJudge(RoundJudge roundJudge);
	
	public void deleteRoundJudge(int id);
	
	public RoundJudgeListModel getRoundJudgeByPage(int offset, int limit);
	
	public void bindingRoundJudge(int id, String judge);
	
	public RoundJudge getRoundJudgeById(int id);
}
