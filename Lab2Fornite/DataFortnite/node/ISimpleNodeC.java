package node;

public interface ISimpleNodeC <T>{
	
	/**
	 * getItem() : get the item of the list 
	 * pre  : the item != null 
	 * post : the item has been return 
	 * return 
	 * */
	public T getItem();
	
	/**
	 * setItem()   : change the item of the list 
	 * @param item : T a object that replace the node in the list
	 * pre         : the item that want change exist 
	 * post        : the item has been chance     
	 * */
	public void setItem(T item);
	
	/**
	 * getNext() : get the next item in the list whit respect to before item 
	 * pre       : the next item != null 
	 * post      : the next item has been obtained  
	 * return    : a object type ISimpleNode<T> 
	 * */
	public ISimpleNodeC<T> getNext();
	
	/**
	 * setNext()   : change the next item in the list 
	 * @param node : ISimpleNodo<T> the new item that be replace for the previous  
	 * pre         : node != null 
	 * post        : the item has been chance for the node
	 * */
	public void setNext(ISimpleNodeC<T> node);

}