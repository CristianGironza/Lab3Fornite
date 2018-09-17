package queue;

import node.ISimpleNodeC;

import node.SimpleNodeC;

public class QueueC<T> implements IQueueC<T> {

	private ISimpleNodeC<T> first;
	
	private ISimpleNodeC<T> last;
	
	@Override
	public void add(T item) {
		ISimpleNodeC<T> node = new SimpleNodeC<T>(item);
		if(first==null) {
			first = node;
			last = first;
		}else {
			last.setNext(node);
			last = last.getNext();
		}
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
	public T remove() throws QueueCException {
		if(first==null) {
			throw new QueueCException();
		}else {
			T item = first.getItem();
			first = first.getNext();
			return item;
		}
	}
	 
}
