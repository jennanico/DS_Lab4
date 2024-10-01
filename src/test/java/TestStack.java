import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack
{

	MyStack<String> stack;
	String stringA;
	String stringB;
	String stringC;
	
	@BeforeEach
	void setUp() throws Exception
	{
		stringA = "Hi";
		stringB = "Hello";
		stringC = "Greetings";
	}

	@Test
	void testStackUnderFlow()
	{
		MyStack<String> stack = new MyStack<String>();
		
		assertThrows(StackUnderFlowException.class, () -> {
			stack.pop();
		});
	}
	
	@Test
	void testStack()
	{
		MyStack<String> stack = new MyStack<String>();
		String popped;
		
		stack.push(stringA);
		assertEquals(stringA, stack.top());
	
		stack.push(stringB);
		stack.push(stringC);
		
		popped = stack.pop();
		assertEquals(stringC, popped);
		
		assertEquals(stringB, stack.top());
		
		popped = stack.pop();
		assertEquals(stringB, popped);
		
		assertEquals(stringA, stack.top());
		popped = stack.pop();
		assertEquals(stringA, popped);
		
		assertEquals(true, stack.isEmpty());
		
		assertThrows(StackUnderFlowException.class, () -> {
			stack.pop();
		});
	}

}
