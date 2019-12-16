package com.filehandling;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getResultsPath {

	public static String main(String[] args) {
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		System.out.println(sdf.format(d));

		String currentDate=sdf.format(d);

		/*sdf=new SimpleDateFormat("HH:mm:SS");
		sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");
		System.out.println(sdf.format(d));
		*/		
			
		//gerneric method format applicable for all files (path with currentdate)
		String path=System.getProperty("user.dir")+"\\Results\\"+currentDate;


		File f=new File(path);

		if(!f.exists())f.mkdirs();

		return path;
	}

}
