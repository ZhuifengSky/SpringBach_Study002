package com.main;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class ReportItemWriter implements ItemWriter<Report>{
	public void write(List<? extends Report> reports) throws Exception {
		for (Report m : reports) {
			System.out.println("Êý¾ÝÐ´Èë : "+m);
		}
	}
}
