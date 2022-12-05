package util;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class UIUtilities {
	 public WebDriver driver;
	public WebDriverWait wait;

	public UIUtilities(WebDriver driver) {
		this.driver = driver;
	}


	//IMPLICIT WAIT
	/**
	 * @param millis Time in milliseconds to wait for the page to Load
	 */
	public  void waitForPageToLoad(long seconds) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	// EXPLICIT WAIT
	public  void waitForElementVisible( WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getXpathFromWebElement(element))));
	}

	//FLUENT WAIT	

	public  WebDriver waitForElementToBeDisplayed(WebDriver driver,  WebElement webElement){
		final String myElementxpath =getXpathFromWebElement(webElement);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)) 
				.ignoring(NoSuchElementException.class);

		webElement = wait.until(new Function<WebDriver, WebElement>()
		{    
			public WebElement apply(WebDriver driver)
			{   
				return driver.findElement(By.xpath(myElementxpath));
			}
		});  
		return driver;

	}

	/**
	 * @param driver
	 * @param element 
	 * @throws Exception
	 */
	public  void scrollToViewElement (WebDriver driver, WebElement element)throws Exception {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500); 
		}catch (Exception e) {
			System.out.println("Error, not able to scroll to view Element");
			e.printStackTrace();
			throw e;
		}
	}


	public static  String getXpathFromWebElement(WebElement webElement){
		String strXpath = webElement.toString();
		if(strXpath.contains("xpath: ")){

			return (webElement.toString().substring((webElement.toString().indexOf("xpath: ")+7),(webElement.toString().length()-1)).trim());
		}
		return strXpath.trim();
	}
	
	public void jsClick(WebElement elem, WebDriver driver) {
	    ((JavascriptExecutor) driver).executeScript(
	        "arguments[0].click();", elem
	    );
	    try { Thread.sleep(1000L); }
	    catch (InterruptedException ie) { ; /* ignore */ }
	}
	
	public static void jsClick(By elem, WebDriver driver) {
	    ((JavascriptExecutor) driver).executeScript(
	        "arguments[0].click();", elem
	    );
	    try { Thread.sleep(1000L); }
	    catch (InterruptedException ie) { ; /* ignore */ }
	}
	
public void moveToElementAndClick(WebDriver driver, WebElement element) {
	
	Actions act =  new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(getXpathFromWebElement(element)))).click().perform();
}
public void clickWithRetry(WebElement element) {
    int attempts = 0;
    while(attempts < 5) {
        try {
        	jsClick(element, driver);
            break;
        }
        catch(StaleElementReferenceException staleException) {
            staleException.printStackTrace();
        }
        attempts++;
    }
}
}
