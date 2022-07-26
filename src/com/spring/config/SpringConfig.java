package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.classes.CricketCoach;
import com.spring.classes.ExpertAdvice;
import com.spring.classes.FootballCoach;
import com.spring.classes.PracticeAdvice;
import com.spring.classes.SportsCoach;

@Configuration
@ComponentScan("com.spring.classes")
public class SpringConfig {
	
	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
	}
	
	@Bean
	public SportsCoach cricketCoach() {
		return new CricketCoach(practiceAdvice());
	}
	
	@Bean 
	public SportsCoach footballCoach() {
		return new FootballCoach();
	}

}
