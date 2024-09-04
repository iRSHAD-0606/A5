package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritizeTests {
	@Test(priority = 2)
	public void demo1() {
		Reporter.log("DEMO 1");
	}
	@Test(priority = 2)
	public void demo2() {
		Reporter.log("DEMO 2");
	}
	@Test(priority = -2)
	public void demo3() {
		Reporter.log("DEMO 3");
	}
	@Test
	public void demo4() {
		Reporter.log("DEMO 4");
	}
	@Test(priority = -1)
	public void demo5() {
		Reporter.log("DEMO 5");
	}
	@Test(priority = 1)
	public void demo6() {
		Reporter.log("DEMO 6");
	}

}
