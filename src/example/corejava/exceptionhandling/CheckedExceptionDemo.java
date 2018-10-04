package example.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		PrintWriter pw = null;
		File file = new File("C:\\WorkSpace\\Projects\\JAVA\\src\\example\\corejava\\exceptionhandling\\abc.txt");
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing in file");
		
		pw.println("Hello");
		pw.flush();
		pw.close();
		//System.out.println(10/0);
	}

}
