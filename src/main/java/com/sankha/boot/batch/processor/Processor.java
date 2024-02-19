package com.sankha.boot.batch.processor;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		System.out.println("Inside process() of Processor class");
		return "PROCESSED " + item.toUpperCase();
	}

}
