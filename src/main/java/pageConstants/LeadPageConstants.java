package pageConstants;

public class LeadPageConstants {
	
	
	/*
	 * Create Account Page elements General
	 */	
	public static final String LEAD_FIRSTNAME="//label[text()='First Name']/following-sibling::div/input";
	public static final String LEAD_LASTNAME ="//label[text()='Last Name']/following-sibling::div/input";
	public static final String LEAD_PHONE ="//label[text()='Phone']/following-sibling::div/input";
	public static final String LEAD_COMPANY ="//label[text()='Company']/following-sibling::div/input";
	public static final String LEAD_SOURCE_FIELD ="//label[text()='Lead Source']/following-sibling::div/lightning-base-combobox";
	public static final String LEAD_SOURCE_OPTION ="//span[text()='+@SOURCE+']";
	public static final String LEAD_STATUS_FIELD ="//label[text()='Lead Status']/following-sibling::div//lightning-base-combobox";
	public static final String LEAD_STATUS_OPTION ="//span[text()='+@STATUS+']";
	public static final String LEAD_RATING_FIELD ="//label[text()='Rating']/following-sibling::div/lightning-base-combobox";
	public static final String LEAD_RATING_OPTION ="//span[text()='+@RATING+']";

	/*
	 * Lists
	 */	
	public static final String LEAD_SELECT_LIST_VIEWS="//lightning-primitive-icon//ancestor::button[@title='Select a List View']";
	public static final String LEAD_OPENLEADS_VIEW="//*[contains(text(),'All Open Leads')]/..";
	public static final String LEAD_OPEN_FIRST_RECORD="//div/table/tbody/tr[1]//th//a";
	public static final String LEAD_CONVERT_BTN="//ul//li//runtime_platform_actions-action-renderer[@title='Convert']//button";
	public static final String LEAD_CONVERT_MODAL_BTN="//div[@class='modal-footer slds-modal__footer']//button[contains(text(),'Convert')]";
	public static final String LEAD_CONVERTED_LEAD_MSG="//div[@class='header']//lightning-formatted-text[contains(text(),'Your lead has been converted')]";
	public static final String LEAD_CONVERT_CLOSE_MODAL="//button[@title='Close this window']";

}
