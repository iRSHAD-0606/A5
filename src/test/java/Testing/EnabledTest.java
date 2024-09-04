package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
	@Test(invocationCount = -2)
	public void demo1() {
		Reporter.log("DEMO 1");
	}
	@Test
	public void demo2() {
		Reporter.log("DEMO 2");
	}
	@Test(enabled = false)
	public void demo3() {
		Reporter.log("DEMO 3");
	}

}
