package stack;

import node.ISimpleNodeC;
import node.SimpleNodeC;

public class StackC <T> implements IStackC<T> {
	
	private ISimpleNodeC<T> first;
	
	/**
	 * isEmpty() : query if the list be empty or not 
	 * @return   : true  - if the stack is empty
	 * 			 : false - if the stack is not empty
	 */
	@Override
	public boolean empty() {
		boolean empty = true;
		if(first!=null) {
			empty = false;
		}
		return empty;
	}

	/**
	 * peek()    : query the element in the stack without take this element 
	 * @return T : the element that has been query
	 */
	@Override
	public T peek() {
		T item = null;
		if(first!=null) {
			item = first.getItem();
		}
		return item;
	}

	/**
	 * pop()     : remove the object at the top of this stack 
	 * @return T : that object as the value of this function.
	 */
	@Override
	public T pop() throws StackCException {
		if(!empty()) {
			T item = first.getItem();
			first = first.getNext();
			return item;
		}else {
			throw new StackCException();
		}
	}

	/**
	 * push()        : add element to the final of this stack  
	 * @param item T : the object that has been added to the stack  
	 * @return       : the item argument
	 */
	@Override
	public void push(T item) {
		ISimpleNodeC<T> node = new SimpleNodeC<T>(item);
		if(first==null) {
			first=node;
		}else {
			ISimpleNodeC<T> assistant = first;
			first = node;
			first.setNext(assistant);
		}
	}
	
}
