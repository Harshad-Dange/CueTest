package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		FileInputStream input=new FileInputStream("src/main/java/com/configurations/config.properties");
		pro.load(input);
		
		System.out.println(pro.getProperty("username"));
	}

}
