package stack;

public interface IStackC <T> {

	/**
	 * 
	 * @return
	 */
	public boolean empty();
	
	/**
	 * 
	 * @return
	 */
	public T peek();
	
	/**
	 * 
	 * @return
	 */
	public T pop() throws StackCException;
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public void push(T item);
	
}
