package demo_package;

import org.openqa.selenium.WebDriver;
import demo_utility.BaseTest;

public class Launch_Browser extends BaseTest {
  	WebDriver driver = WebDriverLoad();
  	
  public WebDriver LaunchURL() {
	  	String baseurl = "http://newtours.demoaut.com/mercurywelcome.php";
		driver.get(baseurl);
		driver.manage().window().maximize();
		return driver;
  }

 }
