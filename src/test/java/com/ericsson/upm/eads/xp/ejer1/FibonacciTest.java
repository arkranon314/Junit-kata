package com.ericsson.upm.eads.xp.ejer1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		
		Object[][] values = {
			{ 0, 0 }, 
			{ 1, 1 }, 
			{ 2, 1 }, 
			{ 3, 2 }, 
			{ 4, 3 }
		};
		
		return Arrays.asList(values);
	}

	@Parameter(0)
	public int fInput;

	@Parameter(1)
	public int fExpected;

	@Test
	public void test() {
		assertEquals(fInput,fExpected);
	}
}