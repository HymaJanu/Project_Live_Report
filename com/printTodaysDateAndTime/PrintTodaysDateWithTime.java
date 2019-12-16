package com.printTodaysDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTodaysDateWithTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
System.out.println(sdf.format(d));

SimpleDateFormat SDF=new SimpleDateFormat("hh:mm:ss");
System.out.println(SDF.format(d));

SimpleDateFormat DT=new SimpleDateFormat("dd-MM-yyy"+" "+"hh:mm:ss");
System.out.println(DT.format(d));

//or//

SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");
System.out.println(dt.format(d));

	}

}
