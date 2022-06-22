package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		//creating object of class
		MyJunit junit = new MyJunit();
	int result=junit.add(10, 20);
	assertEquals(30, result); 
	}

}
