package com.printTodaysDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTodayDate {

	public static void main(String[] args) {
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
		System.out.println(sdf.format(d));
	}

}
