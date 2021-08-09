package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	protected WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver = driver; // driver protected
		PageFactory.initElements(driver, this);
	}
}
