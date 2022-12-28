package smart.usa.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteFailedTestCases {

	@Test
    public void getTest1() {
		Assert.assertTrue(true);
    	System.out.println("Test1 Action");
		
	}
	@Test
    public void getTest2() {
		Assert.assertTrue(true);
    	System.out.println("Test2 Action");
		
	}
	@Test
    public void getTest3() {
		Assert.assertTrue(true);
    	System.out.println("Test3 Action");
		
	}
}