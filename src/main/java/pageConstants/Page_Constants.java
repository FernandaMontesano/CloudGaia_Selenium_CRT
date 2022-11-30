package pageConstants;

public class Page_Constants {
	
	//Salesforce Login Page fields. 

	public static final String USERNAME_TXT_FIELD = "//input[@name='username']";
	public static final String PASSWORD_TXT_FIELD = "//input[@name='pw']";
	public static final String LOGIN_BTN = "//input[@name='Login']";


	//Salesforce app launcher

	public static final String APP_LAUNCHER_ICON = "//div[@class ='slds-icon-waffle']/ancestor::button";
	public static final String APP_VIEW_ALL_LNK = "//*[contains(text(),'View All')]";//
	public static final String APP_SEARCH_TXT_FIELD ="//input[@placeholder = 'Search apps and items...']";
	public static final String APP_SEARCH_FOUND_ITEM="//one-app-launcher-menu-item/a[@data-label = \"Sales\"]";

	//app name , example: Sales
	public static final String APP_PAGE_TITLE = "//span[@title = '+@APPNAME+']";

	public static final String APP_TAB_NAME ="//a[@title = '+@TAB+']/..";// "//a[@title = '+@TAB+']/..";
	
	public static final String APP_IFRAME = "//iframe[@title='dashboard']";

	
	// Page Buttons

	//Create New Record

	public static final String NEW_RECORD_BTN = "//a[@title = 'New']/..";
	
	
	//YPF Industrias APP
	/*
	 * Navigate to an Item from Industrias Menu
	 */	
	
	public static final String APP_MENU = "//button[@title = 'Mostrar menú de navegación']/span";
	public static final String MENU_OPTION= "//span[@class= 'slds-media__body']/span[text()='+@MENU_ITEM+']";



}
