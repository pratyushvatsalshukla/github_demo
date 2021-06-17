package testproject.cal;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
	
	@Test
	public void testAdd()
	{
		Calculations c=new Calculations();
		int sum=c.add(20,30);
		assertEquals(50, sum);
	}
	
	@Test
	public void testEqual()
	{
	Calculations c=new Calculations();
	boolean b=c.isEqual(30, 40);
	assertEquals(true,b);
	}
	
	@Test
	public void testSquare()
	{
		Calculations c=new Calculations();
		int x=c.square(30);
		assertEquals(900, x);
	}
}
