package pageObjects;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageConstants.AccountPageConstants;

public class AccountPage extends Page {
	
	public AccountPage (WebDriver driver) {
		super(driver);
	}
	public AccountPage init(WebDriver driver)throws MalformedURLException {
		AccountPage accountPageInd = PageFactory.initElements(driver, AccountPage.class);
		accountPageInd.setDriver(driver);
		return accountPageInd;
	}
	
	/*
	 * Create Account Page  General
	 */	
	@FindBy(xpath = AccountPageConstants.ACCOUNT_FANTASY_NAME)
	private WebElement accountCPAccountFantasyName;
	public WebElement getAccountCPAccountFantasyName() {
		return accountCPAccountFantasyName;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_SUBCATEGORY_FIELD)
	private WebElement accountCPAccountSubcategoria;
	public WebElement getAccountCPAccountSubcategoria() {
		return accountCPAccountSubcategoria;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_SUBCATEGORY_OPTION)
	private WebElement accountCPSubcategoriaOption;
	public WebElement getAccountCPSubcategoriaOption(String subcategory, WebDriver driver) {
		return accountCPSubcategoriaOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_SUBCATEGORY_OPTION.replace("+@SUBCATEGORY+", subcategory)));
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_GEOGRAPHIC_REGION_FIELD)
	private WebElement accountCPAccountRegionGeografica;
	public WebElement getAccountCPAccountRegionGeografica() {
		return accountCPAccountRegionGeografica;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_GEOGRAPHIC_REGION_OPTION)
	private WebElement accountCPRegionGeograficaOption;
	public WebElement getAccountCPRegionGeograficaOption(String geographicRegion, WebDriver driver) {
		return accountCPRegionGeograficaOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_GEOGRAPHIC_REGION_OPTION.replace("+@GEOGRAPHIC_REGION+", geographicRegion)));
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_REGIONAL_FIELD)
	private WebElement accountCPAccountRegional;
	public WebElement getAccountCPAccountRegional() {
		return accountCPAccountRegional;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_REGIONAL_OPTION)
	private WebElement accountCPRegionalOption;
	public WebElement getAccountCPRegionalOption(String regional, WebDriver driver) {
		return accountCPRegionalOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_REGIONAL_OPTION.replace("+@REGIONAL+", regional)));
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_PROCESS_TYPE_FIELD)
	private WebElement accountCPProcessType;
	public WebElement getAccountCPProcessType() {
		return accountCPProcessType;
	}
	@FindBy(xpath = AccountPageConstants.ACCOUNT_PROCESS_TYPE_OPTION)
	private WebElement accountCPProcessTypeOption;
	public WebElement getAccountCPProcessTypeOption(String processType, WebDriver driver) {
		return accountCPProcessTypeOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_PROCESS_TYPE_OPTION.replace("+@PROCESS_TYPE+", processType)));
	}
	
	/*
	 * Create Account Page  Transporte
	 *
	 */	
	
	@FindBy(xpath = AccountPageConstants.ACCOUNT_PAIS_FIELD)
	private WebElement accountCPPais;
	public WebElement getAccountCPPais() {
		return accountCPPais;
	}
	
	@FindBy(xpath = AccountPageConstants.ACCOUNT_PAIS_OPTION)
	private WebElement accountCPPaisOption;
	public WebElement getAccountCPPaisOption(String pais, WebDriver driver) {
		return accountCPPaisOption = driver.findElement(By.xpath(AccountPageConstants.ACCOUNT_PAIS_OPTION.replace("+@PAIS+", pais)));
	}
	
}
