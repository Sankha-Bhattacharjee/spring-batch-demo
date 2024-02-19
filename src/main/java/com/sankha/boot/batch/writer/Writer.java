package com.sankha.boot.batch.writer;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(Chunk<? extends String> chunk) throws Exception {
		System.out.println("Inside write() of Writer class");
		System.out.println("Writing data: " + chunk);
	}

}
