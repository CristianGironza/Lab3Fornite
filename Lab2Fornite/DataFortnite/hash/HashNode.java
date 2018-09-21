package hash;

public class HashNode<K,T>{

    K key; 
    T item; 
  
    
    HashNode<K, T> next; 
  
    // Constructor 
    public HashNode(K key, T item) 
    { 
        this.key = key; 
        this.item = item; 
    } 
	
}
