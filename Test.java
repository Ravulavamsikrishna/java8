package Filecreate;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f=new File("D:\\filejava.txt");
		boolean result;
		try {
			result=f.createNewFile();
			if(result){
				System.out.println("file created"+f.getCanonicalPath());
			}
			else {
				System.out.println("file not created"+f.getCanonicalPath());
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
