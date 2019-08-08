package com.atmecswebpage.constants;

import java.io.File;

public class ConstantData {

	final static String USER_HOME = System.getProperty("user.dir") + File.separator;
	
	final static String LIB_RESOURCES = USER_HOME + "lib" +File.separator;
	
	public final static String CHROME_DRIVER_PATH = LIB_RESOURCES + "chromedriver.exe";
	//final static String FIREFOX_DRIVER_PATH = LIB_RESOURCES + "geckodriver.exe";
	//final static String IE_DRIVER_PATH = LIB_RESOURCES + "IEDriverServer.exe";

	
	
}
