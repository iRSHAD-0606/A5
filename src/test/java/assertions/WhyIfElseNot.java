package assertions;

import org.testng.annotations.Test;

public class WhyIfElseNot {
	
	@Test
	public void demo()
	{
		String s1="Hi";
		String s2="hi";
		if(s1.equals(s2))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
}
