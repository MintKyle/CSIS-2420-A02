//Kyle Fackrell, Jared Hunter
package Randomized;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
	private Node first, last;
	private int size;

	private class Node {
		private Item item;
		private Node next;
		private Node prev;
	}

	// construct an empty deque
	public Deque() {
		first = null;
		last = null;
		size = 0;
	}

	// is the deque empty?
	public boolean isEmpty() {
		return size == 0;
	}

	// return the number of items on the deque
	public int size() {
		return size;
	}

	// insert the item at the front
	public void addFirst(Item item) {
		if (item == null) {
			throw new NullPointerException();
		}
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		size++;
		
		if (last == null) {
			last = first;
		} else {
			first.next = oldFirst;
			oldFirst.prev = first;
		}
	}

	// insert the item at the end
	public void addLast(Item item) {
		if (item == null) {
			throw new NullPointerException();
		}
		Node oldLast = last;
		last = new Node();
		last.item = item;
		size++;

		if (first == null) {
			first = last;
		} else {
			last.prev = oldLast;
			oldLast.next = last;
		}
	}

	// delete and return the item at the front
	public Item removeFirst() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		Item item = first.item;
		size--;
		
		if (isEmpty()) {
			first = null;
			last = null;
		} else {
			first = first.next;
			first.prev = null;
		}
		return item;
	}

	// delete and return the item at the end
	public Item removeLast() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		Item item = last.item;
		size--;
		
		if (isEmpty()) {
			first = null;
			last = null;
		} else {
			last = last.prev;
			last.next = null;
		}
		return item;
	}

	// return an iterator over items in order from front to end
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {
		private Node current = first;

		public boolean hasNext() {
			return current != null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			Item item = current.item;
			current = current.next;
			return item;
		}
	}

	// unit testing
	public static void main(String[] args) {
		Deque<Integer> deque = new Deque<Integer>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		deque.addLast(4);
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());
		
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			deque.addFirst(i);
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.println(deque.removeLast());
//		}

		System.out.println("size: " + deque.size());
		System.out.println("Empty? " + deque.isEmpty());
	}
}