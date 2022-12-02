package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageConstants.ContactPageConstants;
import pageConstants.Page_Constants;

import java.net.MalformedURLException;

public class ContactPage extends Page{

    public ContactPage (WebDriver driver) {
        super(driver);
    }
    public ContactPage init(WebDriver driver)throws MalformedURLException {
        ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
        contactPage.setDriver(driver);
        return contactPage;
    }


    //Create Contact page

    @FindBy(xpath = ContactPageConstants.CONTACT_FNAME)
    private WebElement contactFName;
    @FindBy(xpath = ContactPageConstants.CONTACT_LNAME)
    private WebElement contactLName;

    public WebElement getContactFName() {
        return contactFName;
    }

    public void setContactFName(WebElement contactFName) {
        this.contactFName = contactFName;
    }

    public WebElement getContactLName() {
        return contactLName;
    }

    public void setContactLName(WebElement contactLName) {
        this.contactLName = contactLName;
    }




}
