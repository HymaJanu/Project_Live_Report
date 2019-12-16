package com.printTodaysDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintPresentTime {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat SDF=new SimpleDateFormat("hh:mm:ss");
		System.out.println(SDF.format(d));

	}

}
