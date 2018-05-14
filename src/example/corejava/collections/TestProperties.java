package example.corejava.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath ="D://SeleniumWS//Core_Java//src//example//corejava//collections//abc.properties";
		FileInputStream fis = new FileInputStream(filepath);
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("user"));
	}

}
