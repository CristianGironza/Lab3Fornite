package stack;

import node.ISimpleNodeC;
import node.SimpleNodeC;

public class StackC <T> implements IStackC<T> {
	
	private ISimpleNodeC<T> first;
	
	@Override
	public boolean empty() {
		boolean empty = true;
		if(first!=null) {
			empty = false;
		}
		return empty;
	}

	@Override
	public T peek() {
		T item = null;
		if(first!=null) {
			item = first.getItem();
		}
		return item;
	}

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
