package pages;

import org.openqa.selenium.Dimension;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Revenuecaluculator {
	
	 WebDriver driver;
	 JavascriptExecutor jse ;
	
	
	public Revenuecaluculator(WebDriver driver) {
		this.driver=driver;
	}
	
	
	/* By slider = By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']");
	 By buttonslider = By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']");
	 By textbox = By.id(":r0:");
	*/
	By buttonslider = By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']");
	By slider = By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']");
	By textbox = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']");
	By textbox1 = By.xpath("//input[@id=':R57alklff9da:']");
	By checkbox = By.xpath("/html/body/div/div[1]/div[2]/div[1]/label");
	By checkbox1 = By.xpath("/html/body/div/div[1]/div[2]/div[2]/label");
	By checkbox2 =By.xpath("/html/body/div/div[1]/div[2]/div[3]/label");
	By checkbox3 = By.xpath("/html/body/div/div[1]/div[2]/div[8]/label");
	
	public void scrollpage() {
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");		
	}
	
	public void adjustslider() {
		
		WebElement element = driver.findElement(buttonslider);
		//jse.executeScript("arguments[0].setAttribute('style','left:40%;')", element);
		System.out.println("Location" + element.getLocation());
		/*Actions ac = new Actions(driver);
		ac.moveToElement(element).clickAndHold().moveToLocation(743, 663).build().perform();
		System.out.println("Location1" + element.getLocation());
		*/
		Actions ac = new Actions(driver);
		WebElement element1 = driver.findElement(slider);
		Dimension sliderwidth = element1.getSize();
		System.out.println(sliderwidth);
		ac.moveToElement(element).clickAndHold().moveByOffset(94, 30).release().perform();
		System.out.println(sliderwidth);
		System.out.println("Location" + element.getLocation());
		WebElement text = driver.findElement(textbox);
		if(textbox.equals("823")) {
			System.out.println("Slider moved to 823");
		}else
		{
			System.out.println("Slider not moved to 823");
		}
		
	}
	
	public void updatetext() {

		//driver.findElement(textbox).click();
		driver.findElement(textbox).clear();
		driver.findElement(textbox).sendKeys("560");
		if(textbox.equals("560")) {
			System.out.println("Slider moved to 823");
		}else
		{
			System.out.println("Slider not moved to 823");
		}
	}
	
	public void clickcheckbox() {
		driver.findElement(checkbox).click();
		driver.findElement(checkbox1).click();
		driver.findElement(checkbox2).click();
		driver.findElement(checkbox3).click();
	}
	

}
