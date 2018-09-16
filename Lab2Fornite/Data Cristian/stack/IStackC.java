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
	public T pop();
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public T push(T item);
	
}
