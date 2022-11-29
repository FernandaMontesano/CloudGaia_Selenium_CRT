package pageConstants;

public class AccountPageConstants {


	
	/*
	 * CP = Create Page
	 * EP = Edit Page
	 * DP = Detail Page
	 * RT = Related Tab Page
	 */

	/*
	 * Create Account Page elements General
	 */	
	public static final String ACCOUNT_FANTASY_NAME="//label[text()='Nombre de Fantasía']/following-sibling::div/input";
	public static final String ACCOUNT_SUBCATEGORY_FIELD="//label[text()='Subcategoría']/following-sibling::div//button";
	public static final String ACCOUNT_SUBCATEGORY_OPTION="//lightning-base-combobox-item//span[@title = '+@SUBCATEGORY+']";
	public static final String ACCOUNT_GEOGRAPHIC_REGION_FIELD="//label[text()='Región Geográfica']/following-sibling::div//button";
	public static final String ACCOUNT_GEOGRAPHIC_REGION_OPTION="//span[@title= '+@GEOGRAPHIC_REGION+']";
	public static final String ACCOUNT_REGIONAL_FIELD="//label[text()='Regional']/following-sibling::div//button";
	public static final String ACCOUNT_REGIONAL_OPTION="//lightning-base-combobox-item//span[@title='+@REGIONAL+']";
	public static final String ACCOUNT_PROCESS_TYPE_FIELD="//label[text()='Tipo de proceso']/following-sibling::div//button";
	public static final String ACCOUNT_PROCESS_TYPE_OPTION="//lightning-base-combobox-item//span[@title= '+@PROCESS_TYPE+']";
	
	/*
	 * Create Account Page elements Transporte
	 *
	 */	
	public static final String ACCOUNT_PAIS_FIELD = "//label[text()='País']/..//input";
	public static final String ACCOUNT_PAIS_OPTION = "//lightning-base-combobox/div/div[2]/ul/li/lightning-base-combobox-item//strong[text()='+@PAIS+']";

	/*
	 * Account Detail Page elements
	 */	

	/*
	 * Account Edit Page elements
	 */	

	/*
	 *Account Related Tab Page elements
	 */	

}
