package com.sankha.boot.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Job Started");
	}

	public void afterJob(JobExecution jobExecution) {
		System.out.println("Job Ended: "+ jobExecution.getStatus().toString());
	}
}
