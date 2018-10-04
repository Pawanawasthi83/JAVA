package example.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsKeywordDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String current_Dir = System.getProperty("user.dir");
		File file = new File(current_Dir+File.separator+"src"+File.separator+"example"+File.separator
				+"corejava"+File.separator+"exceptionhandling"+File.separator+"abc.txt");
		
		doWork();
	}

	private static void doWork() throws InterruptedException {
		doMoreWork();
		
	}

	private static void doMoreWork() throws InterruptedException {
		Thread.sleep(1000);;
		
	}

}
