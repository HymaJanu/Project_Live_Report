package com.filehandling;

import java.io.File;

public class FileAndFolderExistMethod {

		public static void main(String[] args) {
			
			File f=new File("C:\\Users\\tm\\Desktop\\TM_Test");
			System.out.println(f.exists()); //it returns bollean value (O/p: false because file doesnt exist as we didnt created)
			
			File d=new File("C:\\Users\\Admin\\Desktop"); //pathlocation
			System.out.println(d.exists()); //it returns bollean value (O/p: True because file does exist as we created)
			
			File F=new File("C:\\Users\\Admin\\Desktop","Testing Masters Workshop"); //pathlocation ,foldername
			System.out.println(F.exists()); //it returns bollean value (O/p: True because file does exist as we created)
			
			File L=new File("C:\\Users\\Admin\\Desktop\\Testing Masters Workshop"); //pathlocation +foldername (combined)
			System.out.println(L.exists()); //it returns bollean value (O/p: True because file does exist as we created)
	}

}
