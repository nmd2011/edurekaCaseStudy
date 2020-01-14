package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchForClasses {
WebDriver driver;
	
	By searchField = By.xpath("//input[@placeholder='Search for a skill you wish to master']");
	By courseName = By.id("//span[contains(text(),'AWS Development Certification Training')]");
	
	
	public SearchForClasses(WebDriver driver1) {
		this.driver = driver1;
		}
	public void searchField(String subject) {
		driver.findElement(searchField).sendKeys(subject);
	}
	
	public void selectCourse( ) {
		driver.findElement(courseName).click();
	}

}
