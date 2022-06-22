package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	public void Addtest()  {
		//creating object of class
		MyJunit junit = new MyJunit();
		String result=junit.ConCat("Hello", " World");
		assertEquals("Hello World", result); 
	}

} 
