package com.spring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportsCoach {

	ExpertAdvice expertAdvice;
	
	@Autowired	
	public CricketCoach(ExpertAdvice expertAdvice) {
		super();
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "Morning 5am - 7am";
	}

	@Override
	public String getExpertAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getAdvice();
	}

}
