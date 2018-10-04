package example.corejava.exceptionhandling;

import java.io.FileInputStream;

public class CEDemoUnreportedException {

	public static void main(String[] args) {
		
		FileInputStream fis = new FileInputStream("ABCD.txt");

	}

}
//CEDemoUnreportedException.java:9: error: unreported exception 
//FileNotFoundException; must be caught or declared to be thrown
//FileInputStream fis = new FileInputStream("ABCD.txt");