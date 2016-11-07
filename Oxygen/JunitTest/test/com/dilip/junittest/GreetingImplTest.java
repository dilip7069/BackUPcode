package com.dilip.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	
	private Greeting greeting;
	@Before
	public void setUp()
	{
		System.out.println("setUP");
		greeting=new GreetingImpl();
		
	}

	@Test
	public void test() {
		System.out.println("test");
      String result=greeting.greet("Junit");
      assertNotNull(result);
      assertEquals("Hello Junit",result);
	}

	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsNull()
	{
		System.out.println("greetShouldThrowAnException_For_NameIsNull");

	      greeting.greet(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_blank()
	{
		System.out.println("greetShouldThrowAnException_For_Blank");

	      greeting.greet("");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After");
		greeting=null;
	}

}
