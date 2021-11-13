package com.workpanelcrm.genericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
public String readPropData(String path,String Key )throws Throwable
{
	FileInputStream fis =new FileInputStream(path);
	Properties prop = new Properties();
	
	prop.load(fis);
	String propValue=prop.getProperty(Key,"Incorrect Key");
	return propValue;
}
}
