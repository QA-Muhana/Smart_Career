package smart.usa.testngframework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestsExecutions {

	@BeforeMethod
	public void getSetUp() {
		System.out.println("Opened Browser");
		
	}
	@Test
    public void getTest1() {
    	System.out.println("Test1 Action");
		
	}
	@Test
    public void getTest2() {
    	System.out.println("Test2 Action");
		
	}
	@Test
    public void getTest3() {
    	System.out.println("Test3 Action");
		
	}
	@Test
    public void getTest4() {
    	System.out.println("Test4 Action");
		
	}
	
	@AfterMethod
    public void getTearDown() {
    	System.out.println("Closed Browser");
	}
}
