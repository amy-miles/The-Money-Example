

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 5, 2021
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(MoneyExampleTests.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());

	}

}
