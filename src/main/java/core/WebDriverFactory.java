package core;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.PropertiesFileReader;

public class WebDriverFactory extends SeleniumTestBase {

	static PropertiesFileReader propReader = new PropertiesFileReader();
	//String browser = propReader.getBrowser();
	String browser = "Chrome";
	public WebDriver CreateBrowser() {

		switch(browser) {

		case ("Chrome"):
			this.getChromeDriver();
		break;
		case("FireFox"):
			this.getFireFoxDriver();

		}
		return driver;	
	}

	public WebDriver getChromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		//Create a map to store  preferences
		Map<String, Object> prefs = new HashMap<String, Object>();
		//Add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		//Create an instance of ChromeOptions
		ChromeOptions chromeOptions = new ChromeOptions();
		// set ExperimentalOption - prefs
		chromeOptions.setExperimentalOption("prefs", prefs);
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("enable-automation");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--dns-prefetch-disable");
		chromeOptions.addArguments("--disable-infobars");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--disable-browser-side-navigation");
		chromeOptions.addArguments("--disable-gpu");
		chromeOptions.addArguments("disable-features=NetworkService");
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30L));
	
		return driver;

	}

	public  WebDriver getFireFoxDriver() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		return driver;

	}
}

