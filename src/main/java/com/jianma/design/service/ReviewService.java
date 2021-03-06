package com.jianma.design.service;

import java.util.List;

import com.jianma.design.model.Production;
import com.jianma.design.model.Review;

public interface ReviewService {

	public void createReview(Review review);
	
	public void updateReview(Review review);
	
	public void deleteReview(int id);
	
	public List<Review> getReviewListByProductionId(int productionId);
	
	public List<Production> getReviewListByUserId(int userId, int scoreSign, int round, int offset, int limit);
	
	public void createReviews(int userId, String productIds,int round);
	
	public void updateReviewScore(int id, int score);
	
	public void updateReviewScoreByCondition(int productionId,int userId, int round, int score);
	
	public List<String> getSendEmailByRound(int round);
	
	public void sendReviewEmail(int round, String emailContent, String testEmail);
	
	public void bindProductAndRound(int productionId, int round);
	
	public int getScoreByCondition(int productionId,int userId, int round);
}
