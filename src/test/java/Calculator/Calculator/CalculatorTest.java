package Calculator.Calculator;

import static org.junit.Assert.*;

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
	@Test
	public void multiplyTest() {
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.multiply(2,2);
		Assert.assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void divideTest() {
		adder = new Adder();
		double expectedValue = 1.0;
		double actualValue = adder.divide(2.0,2.0);
		System.out.println(actualValue);
		System.out.println(expectedValue);
		Assert.assertEquals(expectedValue,actualValue,0.1);
	}
	
}
