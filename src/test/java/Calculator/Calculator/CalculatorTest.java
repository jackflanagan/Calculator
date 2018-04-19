package Calculator.Calculator;

import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest  {

	private Adder adder;
	
	@Test
	public void addTest() {
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.add(2,2);
		Assert.assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void subtractTest() {
		adder = new Adder();
		int expectedValue = 0;
		int actualValue = adder.subtract(2,2);
		Assert.assertEquals(expectedValue,actualValue);
	}
	
}
