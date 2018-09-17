package stack;

public interface IStackC <T> {

	/**
	 * isEmpty() : query if the list be empty or not 
	 * @return   : true  - if the stack is empty
	 * 			 : false - if the stack is not empty
	 */
	public boolean empty();
	
	/**
	 * peek()    : query the element in the stack without take this element 
	 * @return T : the element that has been query
	 */
	public T peek();
	
	/**
	 * pop()     : remove the object at the top of this stack 
	 * @return T : that object as the value of this function.
	 */
	public T pop() throws StackCException;
	
	/**
	 * push()        : add element to the final of this stack  
	 * @param item T : the object that has been added to the stack  
	 * @return       : the item argument
	 */
	public void push(T item);
	
}
