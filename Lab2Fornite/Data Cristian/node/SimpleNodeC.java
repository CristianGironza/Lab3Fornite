package node;

public class SimpleNodeC <T> implements ISimpleNodeC<T> {
	
	private T item;
	private ISimpleNodeC<T> next;
	
	public SimpleNodeC(T item) {
		this.item = item;
		next= null;
	}
	
	@Override
	public T getItem() {
		return item;
	}

	@Override
	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public ISimpleNodeC<T> getNext() {
		return next;
	}

	@Override
	public void setNext(ISimpleNodeC<T> node) {
		next = node;
		
	}
	
}
