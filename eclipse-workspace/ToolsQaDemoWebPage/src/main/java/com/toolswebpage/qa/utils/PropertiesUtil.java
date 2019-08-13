package com.toolswebpage.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.toolswebpage.qa.constants.Constants;



public class PropertiesUtil {
	private static PropertiesUtil propReader;
	private Properties prop;

	//loads all files
	private PropertiesUtil() {
	List<String> propsFiles = Arrays.asList(Constants.CONFIG_PROP_FILE,Constants.ALL_WEBPAGE_LOC_PATH,Constants.TESTDATA_PROP_FILE);
	prop = new Properties();

	for (String filePath : propsFiles) {
	try {
	prop.load(new FileInputStream(new File(filePath)));
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
	}



	 public static PropertiesUtil getInstance()
	 { 
	 if(propReader == null)
	propReader = new PropertiesUtil();
	 return propReader;
	 }


	public String getValue(String key) {
	return prop.getProperty(key);
	}

	
}
