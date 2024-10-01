
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
	
	Node<T> head;
		
	public MyStack()
	{
		head = null;
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		head = new Node<T>(val, head);
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		if (head == null)
		{
			throw new StackUnderFlowException();
		}
		
		return head.val;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		if (head == null)
		{
			throw new StackUnderFlowException();
		}
		
		T popVal = head.val;
		head = head.next;
		
		return popVal;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return (head == null);
	}

}