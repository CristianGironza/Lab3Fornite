package stack;

public interface IStackC <T> {

	/**
	 * isEmpty() : query if the list be empty or not 
	 * @return   : true  - if the stack is empty
	 * 			 : false - if the stack is not empty
	 */
	public boolean isEmpty();
	
	/**
	 * peek()    : query the element in the stack without take this element 
	 * @return T : the element that has been query
	 */
	public T peek();
	
	/**
	 * 
	 * @return
	 */
	public T pop();
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public T push(T item);
	
}
