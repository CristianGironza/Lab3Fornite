package node;

public class SimpleNodeC <T> implements ISimpleNodeC<T> {
	
	/**
	 * item : ...
	 * */
	private T item;
	
	/**
	 * the next object in the list 
	 * */
	private ISimpleNodeC<T> next;
	
	/**
	 * the constructor of the class 
	 * @param item : T 
	 * */
	public SimpleNodeC(T item) {
		this.item = item;
		next= null;
	}

	/**
	 * getItem() : get the item of the list 
	 * pre  : the item != null 
	 * post : the item has been return 
	 * return 
	 * */
	@Override
	public T getItem() {
		return item;
	}

	/**
	 * setItem()   : change the item of the list 
	 * @param item : T a object that replace the node in the list
	 * pre         : the item that want change exist 
	 * post        : the item has been chance     
	 * */
	@Override
	public void setItem(T item) {
		this.item = item;
	}

	/**
	 * getNext() : get the next item in the list whit respect to before item 
	 * pre       : the next item != null 
	 * post      : the next item has been obtained  
	 * return    : a object type ISimpleNode<T> 
	 * */
	@Override
	public ISimpleNodeC<T> getNext() {
		return next;
	}

	/**
	 * setNext()   : change the next item in the list 
	 * @param node : ISimpleNodo<T> the new item that be replace for the previous  
	 * pre         : node != null 
	 * post        : the item has been chance for the node
	 * */
	@Override
	public void setNext(ISimpleNodeC<T> node) {
		next = node;
		
	}
	
}
