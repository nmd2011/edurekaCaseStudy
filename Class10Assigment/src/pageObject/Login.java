package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	By loginButton = By.xpath("//a[@class='signin top-signin giTrackElementHeader hidden-xs']");
	By username = By.id("si_popup_email");
	By password = By.id("si_popup_passwd");
	By submitLoginButton = By.xpath("//button[@class='clik_btn_log btn-block']");
	
	public Login(WebDriver driver1) {
		this.driver = driver1;
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void enterUsername(String usernm) {
		driver.findElement(username).sendKeys(usernm);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickSubmitLoginButton() {
		driver.findElement(submitLoginButton).click();
	}

	
}
