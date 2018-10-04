package example.corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CEDemoExceptionAlreadyCaught {

	public static void main(String[] args) {
		
		try{
			FileInputStream fis = new FileInputStream("ABCD.txt");
		}catch(Exception e){
			e.printStackTrace();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}

	}

}
//CEDemoExceptionAlreadyCaught.java:14: error: exception FileNotFoundException has already been caught
//}catch(FileNotFoundException f){