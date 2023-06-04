package testNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

public class P1_AllAnnotations {
  
	
	@Test(priority = 2,enabled = false)
	public void testCase1() {
		System.out.println("Test case 1");
	}
	
	@Test(invocationCount = 2)
	public void testCase2() {
		System.out.println("Test Case 2");
	}
	
	@Test(timeOut = 1000)
	public void testCase3() {
		System.out.println("Test Case 3");
	}
	
}
