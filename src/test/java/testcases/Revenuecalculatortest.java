package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Revenuecaluculator;
import testbase.Baseclass;

public class Revenuecalculatortest extends Baseclass{
	
	@Test
	public void calculatortest() {
		Homepage home = new Homepage(driver);
		home.calculator();
		
		Revenuecaluculator revenue = new Revenuecaluculator(driver);
		revenue.scrollpage();
		revenue.setSliderValue(null, 820);
		//revenue.settextvalueofslider(820);
		
		
	}

}
