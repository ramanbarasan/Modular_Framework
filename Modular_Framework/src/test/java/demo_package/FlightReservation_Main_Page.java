package demo_package;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightReservation_Main_Page extends Launch_Browser {
	WebDriver driver = LaunchURL();

	 
	  public void Login() {
		  
		  driver.findElement(By.linkText("SIGN-ON")).click();
		  driver.findElement(By.name("userName")).sendKeys("testing");
		  driver.findElement(By.name("password")).sendKeys("testing");
		  driver.findElement(By.name("login")).click();
	  }
	  
	  public void bookticket() {
		  	//Thread.sleep(5000);
			WebElement element = driver.findElement(By.linkText("SIGN-OFF"));
			String strng = element.getText();
			System.out.println(strng);
			Assert.assertEquals("SIGN-OFF", strng);
			driver.findElement(By.xpath("//input[@value='oneway']")).click();
			Select oSelect = new Select(driver.findElement(By.name("fromPort")));
		 	oSelect.selectByValue("London");
			driver.findElement(By.name("findFlights")).click();
			String depart = driver.findElement(By.xpath("//td[@class='title']/font/b/font[contains(text(), 'DEPART')]")).getText();
			System.out.println(depart);
			Assert.assertEquals("DEPART", depart);
			driver.findElement(By.name("reserveFlights")).click();
			driver.findElement(By.name("passFirst0")).sendKeys("Demo");
			driver.findElement(By.name("passLast0")).sendKeys("Selenium");
			driver.findElement(By.name("creditnumber")).sendKeys("1234567891234567");
			List<WebElement> CheckBoxList = driver.findElements(By.name("ticketLess"));
			CheckBoxList.get(1).click();
			driver.findElement(By.name("buyFlights")).click();
			String ExpVal = "Your itinerary has been booked!";
			String ActVal = driver.findElement(By.xpath("//font[@size='+1']")).getText();
			Assert.assertEquals(ExpVal, ActVal);
			System.out.println(ActVal);
			driver.findElement(By.linkText("SIGN-OFF")).click();

			}
	  
	public void CloseBrowser(){
		driver.quit();
	}

}
