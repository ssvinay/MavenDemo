package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPrint 
{

	@Test
	public void m1()
	{
		Reporter.log("How are you",true);
		Reporter.log("I am all fine", true);
	}
	
}
