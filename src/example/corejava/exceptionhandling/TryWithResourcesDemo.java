package example.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) throws IOException{
		
		File file = new File("C:\\WorkSpace\\Projects\\JAVA\\src\\example\\corejava\\exceptionhandling\\abc.txt");
		try(BufferedReader br= new BufferedReader(new FileReader(file))) {
			System.out.println(br.toString());
			}
			}
	}
