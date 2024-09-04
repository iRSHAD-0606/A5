package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount = 2)
	public void demo1()
	{
		Reporter.log("DEMO 1",true);
	}
	
	@Test(invocationCount = 0)
	public void demo2()
	{
		Reporter.log("DEMO 2",true);
	}

	@Test
	public void demo3()
	{
		Reporter.log("DEMO 3",true);
	}

	@Test(invocationCount = -2)
	public void demo4()
	{
		Reporter.log("DEMO 4",true);
	}

}
