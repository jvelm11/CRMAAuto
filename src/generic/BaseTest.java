package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import pompages.LoginPagePOM;

public class BaseTest extends TestUtils implements IAutoConstants{

	
	public static WebDriver driver;
	public LoginPagePOM login;
	
	static {
		
		System.setProperty(CHROMEDRIVER, CHROMEPATH);
		System.setProperty(GECKORIVER, GECKOEPATH);
		System.setProperty(IEDRIVER, IEPATH);
	}
	
	@BeforeMethod
	public void setBrowser() throws InterruptedException {
		
		driver=new FirefoxDriver();
		
		login=new LoginPagePOM(driver);
		
		driver.get(getProperty("URL"));
		
		String ito1=getProperty("ITO");
		
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(ito1), TimeUnit.SECONDS);
		
		login.setUname(getProperty("UNAME"));
		login.setPassword(getProperty("PWD"));
		login.clickLoginBtn();
		
		Thread.sleep(2000);
	}
	
}
