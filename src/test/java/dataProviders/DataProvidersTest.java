package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTest {
	
	@Test(dataProvider = "data")
	public void bookTicketTest(String from, String to)
	{
		System.out.println("From :"+from+"\tTo :"+to);
	}
	
	@DataProvider
	public Object[][] data(){
	Object[][]  obj = new Object[3][2];
	obj[0][0]="HYD";
	obj[0][1]="DELHI";
	
	obj[1][0]="HYD";
	obj[1][1]="KOLKATA";
	
	obj[2][0]="HYD";
	obj[2][1]="PATNA";
	
	return obj;
	}
	
	
}
