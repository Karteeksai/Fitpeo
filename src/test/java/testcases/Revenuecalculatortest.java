package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Revenuecaluculator;
import testbase.Baseclass;

public class Revenuecalculatortest extends Baseclass{
	
	@Test
	public void calculatortest() throws Exception{
		Homepage home = new Homepage(driver);
		home.calculator();
		
		Revenuecaluculator revenue = new Revenuecaluculator(driver);
		Thread.sleep(2000);
		revenue.scrollpage();
		Thread.sleep(2000);
		revenue.adjustslider();
		Thread.sleep(6000);
		revenue.updatetext();
		Thread.sleep(2000);
		revenue.clickcheckbox();
		Thread.sleep(2000);
		
		
		
	}

}
