package node;

public interface ISimpleNodeC <T>{
	
	public T getItem();
	
	public void setItem(T item);
	
	public ISimpleNodeC<T> getNext();
	
	public void setNext(ISimpleNodeC<T> node);
}
