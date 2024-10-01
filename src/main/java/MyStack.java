
public class MyStack<T>
{
	
	public class Node<T>
	{
		T val;
		Node<T> next;
		
		public Node(T value, Node<T> nextNode)
		{
			this.val = value;
			this.next = nextNode;
		}
		
	}
		
	public MyStack()
	{
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{

	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{

		return null;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		return null;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return true;
	}

}