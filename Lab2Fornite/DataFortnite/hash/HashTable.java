package hash;

import java.util.ArrayList;

public class HashTable<K, T> implements IHashTable<K, T>{

	
	 private ArrayList<HashNode<K, T>> hashArray; 
	 
	 private int numberItems;
	 
	 private int size;
	

	 public HashTable(ArrayList<HashNode<K, T>> hashArray, int numberItems, int size) {
		
		 this.hashArray = hashArray;
		 this.numberItems = numberItems;
		 this.size = size;
		 
	}


	@Override
	public void add(K key, T item) {
		
		int index = getIndex(key); 
        HashNode<K, T> head = hashArray.get(index); 
  
        // Check if key is already present 
        while (head != null) 
        { 
            if (head.key.equals(key)) 
            { 
                head.item = item; 
                return; 
            } 
            head = head.next; 
        } 
  
        // Insert key in chain 
        size++; 
        head = hashArray.get(index); 
        HashNode<K, T> newNode = new HashNode<K, T>(key, item); 
        newNode.next = head; 
        hashArray.set(index, newNode); 
  
        // If load factor goes beyond threshold, then 
        // double hash table size 
        if ((1.0*size)/numberItems >= 0.7) 
        { 
            ArrayList<HashNode<K, T>> temp = hashArray; 
            hashArray = new ArrayList<>(); 
            numberItems = 2 * numberItems; 
            size = 0; 
            for (int i = 0; i < numberItems; i++) 
                hashArray.add(null); 
  
            for (HashNode<K, T> headNode : temp) 
            { 
                while (headNode != null) 
                { 
                    add(headNode.key, headNode.item); 
                    headNode = headNode.next; 
                } 
            } 
        } 
		
	}

	@Override
	public int getIndex(K key) {
		// TODO Auto-generated method stub
		int hashCode = key.hashCode(); 
        int index = hashCode % size; 
        return index; 
		
	}

	@Override
	public T remove(K key) {
		
        int bucketIndex = getIndex(key); 
        
        // Get head of chain 
        HashNode<K, T> head = hashArray.get(bucketIndex); 
  
        // Search for key in its chain 
        HashNode<K, T> prev = null; 
        while (head != null) 
        { 
            // If Key found 
            if (head.key.equals(key)) 
                break; 
  
            // Else keep moving in chain 
            prev = head; 
            head = head.next; 
        } 
  
        // If key was not there 
        if (head == null) 
            return null; 
  
        // Reduce size 
        size--; 
  
        // Remove key 
        if (prev != null) 
            prev.next = head.next; 
        else
            hashArray.set(bucketIndex, head.next); 
  
        return head.item; 
	}

	@Override
	public boolean Contains(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	@Override
	public T get(K key) {
		int bucketIndex = getIndex(key); 
        HashNode<K, T> head = hashArray.get(bucketIndex); 
  
        // Search key in chain 
        while (head != null) 
        { 
            if (head.key.equals(key)) 
                return head.item; 
            head = head.next; 
        } 
  
        // If key not found 
        return null; 
	}

}
