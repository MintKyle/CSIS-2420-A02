package Randomized;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdRandom;
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
		if (item == null) {
			throw new NullPointerException();
		}
		else {
			if (n == queue.length) {
				Item[] temp = (Item[]) new Object[2 * queue.length];
				for (int i = 0; i < n; i++) {
					temp[i] = queue[i];
				}
				queue = temp;
			}
			queue[n++] = item;
		}
	}
	
	// delete and return a random item
	public Item dequeue() {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		else {
			int index = StdRandom.uniform(0,n);
			Item toBeRemoved = queue[index];
			queue[index] = queue[n-1];
			queue[n-1] = null;
			n--;
			if (n > 0 && n == queue.length/4) {
				Item[] temp = (Item[]) new Object[queue.length/2];
				for (int i = 0; i < n; i++) {
					temp[i] = queue[i];
				}
				queue = temp;
			}
			return toBeRemoved;
		}
		
	}
	
	// return (but do not delete) a random item
	public Item sample() {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		else {
			return queue[StdRandom.uniform(0,n)];
		}
		
	}
	
	// return an independent iterator over items in random order
	public Iterator<Item> iterator() {
		return null;
		
	}
	
	// unit testing
	public static void main(String[] args) {
		
	}
}
