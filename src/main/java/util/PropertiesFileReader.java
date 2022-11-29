package util;

import java.io.*;
import java.util.Properties;


public class PropertiesFileReader {


	private Properties properties;
	private final String commonPropertyFilePath= "src/test/resources/configuration/system/common.configuration.properties";
	public PropertiesFileReader(){
		BufferedReader reader;
		BufferedReader commonReader;
		try {
			reader = new BufferedReader(new FileReader(getEnvironmentPropertiesFilePath()));
			commonReader = new BufferedReader(new FileReader(commonPropertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				properties.load(commonReader);
				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Properties not found at " + getEnvironmentPropertiesFilePath());
		}		
	}

	private String getEnvironmentPropertiesFilePath(){
		String env = "qa";

		if (env.equalsIgnoreCase("qa")) {
			return "src/test/resources/configuration/qa/qa.configuration.properties";
		}else{
			//Repeating this line. Replace this with the default option in case no environment is provided
			return "src/test/resources/configuration/qa/qa.configuration.properties";
		}

	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the setup.properties file.");
	}
	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if(browser != null) return browser;
		else throw new RuntimeException("Salesforce API version not found");
	}
	
	//User details


	//Administrador de Sistema 
	public String getAdminSystemName() {
		String username = properties.getProperty("admin.system.name");
		if(username != null) return username;
		else throw new RuntimeException("username not specified in the common.properties file.");
	}

	public String getAdminSystemPassword() {
		String password = properties.getProperty("admin.system.password");
		if(password != null) return password;
		else throw new RuntimeException("password not specified in the common.properties file.");
	}

	//Administrador Comercial Industrias
	public String getAdminComercialIndName() {
		String username = properties.getProperty("admin.comercial.name");
		if(username != null) return username;
		else throw new RuntimeException("username not specified in the setup.properties file.");
	}
	public String getAdminComercialIndPasswrod() {
		String password = properties.getProperty("admin.comercial.password");
		if(password != null) return password;
		else throw new RuntimeException("password not specified in the setup.properties file.");
	}
	
	//Automation User
	public String getAutomationUserName() {
		String username = properties.getProperty("automation.name");
		if(username != null) return username;
		else throw new RuntimeException("username not specified in the setup.properties file.");
	}
	public String getAutomationUserPasswrod() {
		String password = properties.getProperty("automation.password");
		if(password != null) return password;
		else throw new RuntimeException("password not specified in the setup.properties file.");
	}



}
