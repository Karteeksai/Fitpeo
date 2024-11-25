package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Revenuecaluculator {
	
	 WebDriver driver;
	
	public Revenuecaluculator(WebDriver driver) {
		this.driver=driver;
	}
	
	
	 By slider = By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']");
	 By buttonslider = By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']");
	 By textbox = By.id(":r0:");
	
	

	public void scrollpage() {
		 WebElement element = driver.findElement(slider);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}

	public  void setSliderValue(WebElement buttonslider,double value) {
		double minvalue =Double.parseDouble(buttonslider.getAttribute("min"));
		double maxvalue = Double.parseDouble(buttonslider.getAttribute("max"));
		int sliderH = buttonslider.getSize().height;
		int sliderw = buttonslider.getSize().width;
		System.out.println(sliderH);
		System.out.println(sliderw);
		Actions ac = new Actions(driver);
		ac.moveToElement(buttonslider,(int)(value*sliderw/(maxvalue-minvalue)),sliderH/2).click().build().perform();
	}
/*
	public void settextvalueofslider(int value) {
		WebElement textfield = driver.findElement(textbox);
		textfield.clear();
		textfield.sendKeys(String.valueOf(value));
	}
	*/
}
