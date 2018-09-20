package hash;

public interface IHashTable <K,T>{
	

	
	public void add( K key, T item );
	
	public T get(K key);
	
	public T remove(K Key);
	
	public boolean exists(T item);
	
	public int size();
	
	

}
