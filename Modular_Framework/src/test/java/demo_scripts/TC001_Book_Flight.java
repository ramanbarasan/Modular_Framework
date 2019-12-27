package demo_scripts;

import org.testng.annotations.Test;
import demo_package.FlightReservation_Main_Page;

public class TC001_Book_Flight {
	FlightReservation_Main_Page CallMainPage = new FlightReservation_Main_Page();

	  @Test
	  public void TC001(){
		   
		  CallMainPage.Login();
		  CallMainPage.bookticket();
		  CallMainPage.CloseBrowser();
	  }

}