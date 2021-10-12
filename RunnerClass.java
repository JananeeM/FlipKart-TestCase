package POM_SC;

import org.testng.TestNG;


public class RunnerClass {

	
	static TestNG testng;
	public static void main(String[] args) {
		
		
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { TestCaseLogin.class });
		
		testng.run();
	}
}
