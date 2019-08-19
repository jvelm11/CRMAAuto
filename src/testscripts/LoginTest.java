package testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import pompages.HomePagePOM;

public class LoginTest extends BaseTest{

	HomePagePOM home;
	
	@Test
	public void loginTest() {
		
		home = new HomePagePOM(driver);
		
		String title=driver.getTitle();
		String expectedtitle="CRMPRO";
		assertEquals(title, expectedtitle);
		Reporter.log("Found Title"+title, true);
		
		home.switchToFrame();
		
		String logo=home.logoTextEle();
		
		String expectedlogo="CRMPRO";
		
		assertEquals(logo, expectedlogo);
		
		Reporter.log("Actual Logo Displayed is"+expectedlogo, true);
	}
}
