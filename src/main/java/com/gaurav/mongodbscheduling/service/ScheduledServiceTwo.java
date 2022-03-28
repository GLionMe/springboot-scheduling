package com.gaurav.mongodbscheduling.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;


public class ScheduledServiceTwo {
	
	@Scheduled(fixedRate = 3000)
	public void myMethond() {
		System.out.println("Hello Scheduled method: " + new Date());
	}
}
