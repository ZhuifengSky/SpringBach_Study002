package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


 
public class ReportFieldSetMapper implements FieldSetMapper<Report> {
 
	 private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		Report report = new Report();
		report.setId(fieldSet.readInt(0));
		String date = fieldSet.readString(1);
		try {
			report.setDate(dateFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return report;
	}
 
}
