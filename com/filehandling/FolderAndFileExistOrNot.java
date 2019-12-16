package com.filehandling;

import java.io.File;

public class FolderAndFileExistOrNot {
	
	public static void main(String[] args) {
		
//Folder:		
/*File f=new File("C:\\Users\\Admin\\Desktop\\Testing Masters Workshop"); //it is a folderpath
if(f.exists())
{
	System.out.println("Folder Exsits");
}
else
{
	System.out.println("Folder doesnot Exsits");
}*/

//File:
File D=new File("C:\\Users\\Admin\\Desktop\\Testing Masters Workshop\\Workshop","Session Notes");
if(D.isFile())
{
	System.out.println("It is a file");
}
else if(D.isDirectory())
{
	System.out.println("It is a directory");
}
		
	}

}
