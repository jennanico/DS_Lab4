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
		MyStack<String> stack = new MyStack<String>();
		stringA = "Hi";
		stringB = "Hello";
		stringC = "Greetings";
	}

	@Test
	void testStackUnderFlow()
	{
		assertThrows(StackUnderFlowException.class, () -> {
			stack.pop();
		});
	}
	
	@Test
	void testStack()
	{
		stack.push(stringA);
		assertEquals(stringA, stack.top());
	
		stack.push(stringB);
		stack.push(stringC);
		
		assertEquals(stringA, stack.pop());
		
		assertEquals(stringB, stack.top());
		assertEquals(stringB, stack.pop());
		
		assertEquals(stringC, stack.top());
		assertEquals(stringC, stack.pop());
		
		assertEquals(true, stack.isEmpty());
		
		assertThrows(StackUnderFlowException.class, () -> {
			stack.pop();
		});
	}

}
