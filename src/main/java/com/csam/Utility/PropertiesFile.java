package com.csam.Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	 public String ProjectPath=System.getProperty("user.dir");
	
	public String getWebDetails(String key) throws IOException {
			FileReader reader = new FileReader(ProjectPath+"/src/test/resources/Properties/Login.properties");
			 Properties prop= new Properties();
			 prop.load(reader);
			 return prop.getProperty(key);
		}

}
