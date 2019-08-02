package com.atmecs.qa.constants;

import java.io.File;

public class Constants {

    public final static String PROJECT_BASE_PATH= System.getProperty("user.dir");
    public final static long PAGE_LODE_TIMEOUT = 20;
	public final static long IMPLICIT_WAIT = 10;
	public final static String LOCATORS_PATH=PROJECT_BASE_PATH
			+File.separator+"resources"+File.separator+"locators"+File.separator;
	public final static String ALL_NAVI_LOC=LOCATORS_PATH+"AllNavigate.properties";
	public final static String NEWS_LOC=LOCATORS_PATH+"News.properties";
	public final static String EVENTS_LOC=LOCATORS_PATH+"Events.properties";
	public final static String CSR_LOC=LOCATORS_PATH+"CSR.properties";
	public final static String CLIENT_ACHIEVE_LOC=LOCATORS_PATH+"ClientAchivements.properties";
	public final static String LOG_4J=PROJECT_BASE_PATH+File.separator+"resources"+File.separator+"log4j-application.properties";
	
	
	
}

