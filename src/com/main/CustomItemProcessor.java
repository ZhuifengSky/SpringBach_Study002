package com.main;

import org.springframework.batch.item.ItemProcessor;


 
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
 
	@Override
	public Report process(Report report) throws Exception {
		System.out.println("数据处理:" + report);
		return report;
	}
 
}
