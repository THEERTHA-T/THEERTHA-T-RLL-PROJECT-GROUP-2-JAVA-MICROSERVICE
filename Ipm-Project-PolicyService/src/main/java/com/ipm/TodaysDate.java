package com.ipm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodaysDate {
	
	public static String todayDate() {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		   LocalDateTime now = LocalDateTime.now();
		   return dtf.format(now);
	}

}
