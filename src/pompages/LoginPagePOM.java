package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(css="input[value='Login']")
	private WebElement loginBtn;
	
	
	public LoginPagePOM(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUname(String uname) {
		
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		
		loginBtn.submit();
	}
	
}
