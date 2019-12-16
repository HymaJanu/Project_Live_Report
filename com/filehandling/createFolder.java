package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class createFolder {

	public static void main(String[] args) throws IOException { //io exception checking user having access to create file or not
		
		File f=new File("C:\\Users\\Admin\\Desktop\\raj","hyma.txt");
		FileWriter fw=new FileWriter(f);
		PrintWriter pw=new PrintWriter(fw);
		pw.println("Hello Testing Masters");
		pw.println("Hymavathi");
		pw.println(123456);
		pw.println("Raj");
		//to print in notepad we need to use below methods
		pw.flush(); //flush print writer
		pw.close(); //close print writer
		fw.close(); //close file writer
		
		/*o/p: Hello Testing Masters
		Hymavathi
		123456*
		Raj/
		
		//overwritten
		pw.println("Raj Xander"); //changed to Raj Xander		
		
		/*o/p: Hello Testing Masters
		Hymavathi
		123456*
		Raj Xander*/ 
		
		//Append---adding new data with existing data
		File F=new File("C:\\Users\\Admin\\Desktop\\raj","janu.txt");
		FileWriter FW=new FileWriter(F,true);
		PrintWriter PW=new PrintWriter(FW);
		PW.println("Hello Testing Masters");
		PW.println("Hymavathi");
		PW.println(123456);
		//to print in notepad we need to use below methods
		PW.flush(); //flush print writer
		PW.close(); //close print writer
		FW.close(); //close file writer
		/*output: Hello Testing Masters
        Hymavathi
        123456*/
		
		//IO (input &output) Exception 
		//throws if io exception ...checking user having access to create a file or not
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
