package com.spring.classes;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice{

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return "Do Not Give Up";
	}

}
