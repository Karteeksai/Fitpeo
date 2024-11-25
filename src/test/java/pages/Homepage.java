package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By revenuecalculator=By.linkText("Revenue Calculator");
	
	
	public void calculator() {
		driver.findElement(revenuecalculator).click();
	}

}
