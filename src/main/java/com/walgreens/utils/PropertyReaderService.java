package com.walgreens.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class PropertyReaderService {
	
	private static PropertyReaderService instance = null;
	
	private Properties properties = new Properties();
	private Map<String, String> envVariable = System.getenv();
	
	
	private PropertyReaderService() {
		Load();
	}
	
	public static PropertyReaderService getInstance() {
		
		if(instance == null) {
			instance = new PropertyReaderService();
		}
		return instance;
	}
	
	public String getProperty(String key) {
		String value = properties.getProperty(key);
		return value;
		
	}
	
	public String getEnvProperty(String key) {
		String  value = null;
		
		if(envVariable.containsKey(key)) {
			value = envVariable.get(key);
			
		}
		return value;
	}
	
	

	private void Load() {
	  String fileName = System.getProperty("user.dir") + "/src/test/resources/RunConfig.properties";
	  
	  FileInputStream input = null;
	  
	  try {
		  
		  input = new FileInputStream(fileName);
		  //load a properties file
		  properties.load(input);
	  }
	  catch (IOException io) {
		  io.printStackTrace();
		
	}finally {
		
		if(input !=null) {
			try {
				input.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
		
	}
	
	
	

}
