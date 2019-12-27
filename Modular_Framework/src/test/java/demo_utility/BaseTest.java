package demo_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class BaseTest {
WebDriver driver;
	
	public WebDriver WebDriverLoad() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\Framework_Example\\chromedriver.exe");
			driver = new ChromeDriver();
		return driver;
}
	@DataProvider(name="Login")
	public Object[][] getDataFromDataprovider(){

	    return new Object[][] {

	            {"http://newtours.demoaut.com/mercurywelcome.php","testing", "testing"},

	            {"http://newtours.demoaut.com/mercurywelcome.php","dixit", "dixit" }

	            };
	}

}
