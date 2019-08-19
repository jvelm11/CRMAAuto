package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import generic.BaseTest;

public class HomePagePOM{

	WebDriver driver;
	AjaxElementLocatorFactory factory;
	
	@FindBy(name="mainpanel")
	private WebElement mainframe1;
	
	@FindBy(xpath="//td[text()='CRMPRO']")
	private WebElement logoText;
	
	public HomePagePOM(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		
	}
	
	
	public void switchToFrame() {
		
		driver.switchTo().frame(mainframe1);
		
	}
	
	public String logoTextEle() {
		
		return logoText.getText();
	}
}
