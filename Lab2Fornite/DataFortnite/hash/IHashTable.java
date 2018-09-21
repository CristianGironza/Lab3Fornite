package hash;

public interface IHashTable <K,T>{
	

	
	public void add( K key, T item );
	
	public int getIndex(K key);
	
	public T get(K key);
	
	public T remove(K key);
	
	public boolean Contains(T item);
	
	public int size();
	
	

}
