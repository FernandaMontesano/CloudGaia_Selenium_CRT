package accountTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import core.SeleniumTestBase;
import pageObjects.AccountPage;
import util.PropertiesFileReader;
import util.UIUtilities;

public class CreateAccountTest extends SeleniumTestBase{

	PropertiesFileReader propertyReader = new PropertiesFileReader();
	String appName = "Industrias";
	String itemName = "Cuentas";
	String recordType = "Minería";
	String accountName = "Auto_Cuenta_"+RandomStringUtils.randomAlphanumeric(16);
	String accountFantasyName= "AutomationMineria";
	String cuit = "34429596078";
	String accountSubcategoria = "Extractivas de Litio";
	String accountTipodeProceso="Continuo";
	String regional = "GBA";
	String calle ="Talcahuano" ;
	String nro = "6960";
	String localidad = "COLONIA CARLOS PELLEGRINI";
	String codigoPostal ="3000";
	String recordId = "";
	
	@Test (groups = { "Regression_Industrias", "Cuentas_Industrias", "Mineria" }, enabled = true )
	public void testCrearCuentaMineria() throws Exception {

		UIUtilities util = new UIUtilities(driver);
		AccountPage ap = new AccountPage(driver);

		try {
			
			ap.userLogIn(driver, propertyReader.getTestUserName(),propertyReader.getTestPassword()); 
   			util.waitForPageToLoad(3000);
	
			System.out.println("Created Account: "+accountName);

		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		} 
		finally {
			
					
			System.out.println("VerifyCreateAccount Test Completed");
		}
	}


}
