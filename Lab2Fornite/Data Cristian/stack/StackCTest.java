package stack;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.AssertionFailedError;

class StackCTest {

	private StackC<Integer> dataEstructure;
	
	public void EmptyStack() {
		dataEstructure = new StackC<Integer>();
	}
	
	public void AStackWithAnObject() {
		dataEstructure = new StackC<Integer>();
		dataEstructure.push(1);
	}
	
	@Test
	public void TestEmpty1() {
		EmptyStack();
		assertTrue(dataEstructure.empty());
	}
	
	@Test
	public void TestEmpty2() {
		AStackWithAnObject();
		assertFalse(dataEstructure.empty());
	}
	
	@Test
	public void peek1() {
		EmptyStack();
		assertNull(dataEstructure.peek());
	}
	
	@Test
	public void peek2() {
		AStackWithAnObject();
		assertNotNull(dataEstructure.peek());
	}
	
	@Test
	public void pop1(){
		EmptyStack();
		try {
			dataEstructure.pop();
			fail();
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void pop2() throws StackCException {
		AStackWithAnObject();
		assertNotNull(dataEstructure.pop());
	}
	
}
