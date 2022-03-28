package com.gaurav.mongodbscheduling.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceThree {
	
	@Scheduled(cron = "* * * * * *")
	public void cronScheduling() {
		System.out.println("Hello Scheduled Cron; " + new Date());
	}

}
