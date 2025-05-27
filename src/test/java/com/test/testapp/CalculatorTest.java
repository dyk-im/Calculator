package com.test.testapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import com.test.testapp.Service.Calculator;

@SuppressWarnings("unused")
public class CalculatorTest {
	private final Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
	@Test
	public void testSub() {
		assertEquals(5, calculator.sub(2, 3));
	}
	@Test
	public void testMul() {
		assertEquals(5, calculator.mul(2, 3));
	}
	@Test
	public void testDiv() {
		assertEquals(5, calculator.div(2, 3));
	}
}
