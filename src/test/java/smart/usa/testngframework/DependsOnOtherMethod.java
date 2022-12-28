package smart.usa.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnOtherMethod {

	@Test
    public void getTest1() {
		Assert.assertTrue(true);
    	System.out.println("Test1 Action");
		
	}
	@Test(dependsOnMethods = {"getTest1"})
    public void getTest2() {
    	System.out.println("Test2 execution depends on Test1");
		
	}
	@Test
    public void getTest3() {
		Assert.assertTrue(true);
    	System.out.println("Test3 Action");
		
	}
    @Test(dependsOnMethods = {"getTest3"})
    public void getTest4() {
    Assert.assertTrue(true);
    System.out.println("Test4 execution depends on Test4");
 
 }}
 
	

