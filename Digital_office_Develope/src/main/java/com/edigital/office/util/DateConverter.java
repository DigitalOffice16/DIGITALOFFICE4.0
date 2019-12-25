package com.edigital.office.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.dozer.CustomConverter;

public class DateConverter implements CustomConverter{

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if (sourceFieldValue == null) {
		      return null;
		    }
		if (sourceFieldValue instanceof Timestamp) {
			DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String str2 = df2.format(sourceFieldValue);
			return str2;
		}
		return null;
	}

}
