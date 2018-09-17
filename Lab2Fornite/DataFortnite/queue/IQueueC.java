package queue;

public interface IQueueC <T>{

	public void add(T item);
	
	public T peek();
	
	public T remove() throws QueueCException;
}
