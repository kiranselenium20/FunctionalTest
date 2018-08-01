package com.csam.CommonLib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormats {
	
	public static String addDate(String format){
		SimpleDateFormat sdfDate = new SimpleDateFormat(format);
		Date date=new Date();
	    return sdfDate.format(date.getTime());
		}
	
	public static String getTime()
	{
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		//return cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
		return cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
	}
	
}
