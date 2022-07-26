package com.spring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FootballCoach implements SportsCoach {
	
	
	ExpertAdvice expertAdvice;
	
	@Autowired
	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "Evening 5pm -7pm";
	}

	@Override
	public String getExpertAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getAdvice();
	}

}
