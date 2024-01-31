package basictest;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {

	
	public void onTestFailiure(ITestResult result) {
		System.out.println("Test Failed");
	}
	
	
	
	
}
