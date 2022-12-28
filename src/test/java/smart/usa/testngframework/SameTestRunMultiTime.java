package smart.usa.testngframework;

import org.testng.annotations.Test;

public class SameTestRunMultiTime {

	@Test(invocationCount=3)
    public void getTest2() {
    	System.out.println("Test2 Action");
		
	}
}
