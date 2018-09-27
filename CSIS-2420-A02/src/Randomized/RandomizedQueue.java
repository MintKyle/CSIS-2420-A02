package Randomized;

import java.util.Iterator;
//import stdlib.jar;

public class RandomizedQueue<Item> implements Iterable<Item> {
	private Item[] queue;
	private int n = 0;
	// construct an empty randomized queue
	public RandomizedQueue() {
		queue = (Item[]) new Object[1];
	}
	
	// is the queue empty?
	public boolean isEmpty() {
		return n == 0;
	}
	
	// return the number of items on the queue
	public int size() {
		return n;
		
	}
	
	// add the item
	public void enqueue(Item item) {
		
	}
	
	// delete and return a random item
	public Item dequeue() {
		return null;
		
	}
	
	// return (but do not delete) a random item
	public Item sample() {
		return null;
		
	}
	
	// return an independent iterator over items in random order
	public Iterator<Item> iterator() {
		return null;
		
	}
	
	// unit testing
	public static void main(String[] args) {
		
	}
}
