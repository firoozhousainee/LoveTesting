package testsuite;

import org.testng.annotations.Test;


public class A extends Parent {
	
	
	@Test
	public void three() {
		
		System.out.println("Test 3");
	}
	
	
	@Test
	public void one() {
		System.out.println("Test 1");
		
	}
	@Test
	public void two() {
		
		System.out.println("Test 2");
		
	}

}