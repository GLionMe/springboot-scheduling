package com.gaurav.mongodbscheduling.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class SchedularServiceOne {
	
	@Scheduled(initialDelay = 2000, fixedDelay = 1000)
	public void scheduledMethod() {
		System.out.println("Hello Schedular One: " + new Date());
	}
	
}
