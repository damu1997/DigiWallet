package com.atmecs.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.qa.constants.Constants;

public class PropertyUtil {
/**
 * 
 * @param filePath
 * @return loads the property used in the init method 
 * @throws IOException
 */
	
	public static Properties loadProperty(String filePath) {
		Properties prop = new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream(filePath);
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	
	public static String readPropertyFile(Properties props,String key) {
        String value = props.getProperty(key);
        return value;
    }
	
	
		
		
	
	public static void main(String[] args) {
		Properties props=loadProperty(Constants.ALL_NAVI_LOC);
		String a=readPropertyFile(props, "Media");
		System.out.println(a);
	}
	
}
