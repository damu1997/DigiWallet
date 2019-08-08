package com.atmecswebpage.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Configuration {

	
public static Properties property;
private final static String  propertyFilePath= "C:\\Users\\Damodaran.Krishnan\\eclipse-workspace\\AtmecsWebPage\\src\\main\\resources\\value.properties";

public  void initialiseProperties(){
	 BufferedReader reader;
 try {
 reader = new BufferedReader(new FileReader(propertyFilePath));
 property = new Properties();
 try {
 property.load(reader);
 reader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
 }
 
	
}
 public String getApplicationUrl() {
 String url = property.getProperty("BASE_URL");
 if(url != null) return url;
 else throw new RuntimeException("url not specified in the Configuration.properties file.");
 }
 
public String getMouseHover(){
 String MouseHover=property.getProperty("MediaMouseOver");
return MouseHover;
}
public String getNews(){
 String NewsXpath=property.getProperty("News");
return NewsXpath;
} 
 public String getCSR(){
 String CSRXpath=property.getProperty("CSR");
return CSRXpath;
}
 public String getEvents(){
 String EventsXpath=property.getProperty("Events");
return EventsXpath;
}
public String getClient(){
 String ClientXpath=property.getProperty("Client");
return ClientXpath;
}
public String getUrl(){
 String UrlXpath=property.getProperty("url");
return  UrlXpath;
}
public String getNewsHeaderContent(){
	 String NewsContentforAssertXpath=property.getProperty("NewsHeaderContent");
	return  NewsContentforAssertXpath;
	}
public String getCSRHeaderContent(){
	 String CSRHeaderContentXpath=property.getProperty("CSRHeaderContent");
	return  CSRHeaderContentXpath;
	}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}