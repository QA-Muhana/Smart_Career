package smart.usa.testngframework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@DataProvider(name="dataProvider")
	public Object [][] dpMethod(){       //Object is the super/parent class from java
		return new Object [][] {{"userName"},{"passWord"}};
		
	}
	

	
	@Test(dataProvider="dataProvider")
  public void getTest(String value) {
	  System.out.println("My parameter is: " + value);
  }
}
