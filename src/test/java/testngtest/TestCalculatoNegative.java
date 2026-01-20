package testngtest;

import java.time.LocalDateTime;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import newjen.task.Calculator;

public class TestCalculatoNegative {
	

	@BeforeClass
	public void beforeTestCalculatorNegative () {
		System.out.println("Executing Before TestClass Activity at " + LocalDateTime.now());
	}
	
	@AfterClass
	public void afterTestCalculatorNegative () {
		System.out.println("Executing After TestClass Activity at " + LocalDateTime.now());
	}
	
	
	
	@Test ( groups = { "smoke"} , expectedExceptions = {ArithmeticException.class} , expectedExceptionsMessageRegExp = "Division by zero *" )
	public void testDivision() {
		
		System.out.println("Executing " +  Thread.currentThread().getStackTrace()[1].getMethodName() + " at " + LocalDateTime.now());
		int quotitent = Calculator.divide(100,0);
			//Test
	}
	
	//@Test ( expectedExceptions = { ArithmeticException.class} , expectedExceptionsMessageRegExp = "Division by zero"  )
	public void testMod() {
		
		System.out.println("Executing " +  Thread.currentThread().getStackTrace()[1].getMethodName() + " at " + LocalDateTime.now());
		int quotitent = Calculator.mod(100,0);
			
	}

	@Test ( groups = { "smoke"} , expectedExceptions = {IllegalArgumentException.class} ,  expectedExceptionsMessageRegExp ="Negative number not allowed" )
	public void testSqrt() {
		
		System.out.println("Executing " +  Thread.currentThread().getStackTrace()[1].getMethodName() + " at " + LocalDateTime.now());
		double sum = Calculator.sqrt(-10);
		//Assert.assertTrue(sum == 30, "Add Assertion Failed");
		
	}
	
	@Test ( groups = { "others"} ) //, expectedExceptions = {IllegalArgumentException.class} ,  expectedExceptionsMessageRegExp ="Negative number not allowed" )
	public void testSqrtInt() {
		
		System.out.println("Executing " +  Thread.currentThread().getStackTrace()[1].getMethodName() + " at " + LocalDateTime.now());
		double sum = Calculator.sqrt(9);
		//Assert.assertTrue(sum == 30, "Add Assertion Failed");
		
	}


}
