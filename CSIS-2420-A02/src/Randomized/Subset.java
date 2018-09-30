//Kyle Fackrell, Jared Hunter
package Randomized;

import edu.princeton.cs.algs4.StdIn;

public class Subset {

	public static void main(String[] args) {
		RandomizedQueue<String> rq = new RandomizedQueue<String>();
		int k = Integer.valueOf(args[0]);
		//System.out.println(k);
		while (!StdIn.isEmpty()) {
            rq.enqueue(StdIn.readString());
        }
		//System.out.println("test");
		for (int i = 0; i < k; i++) {
			
			System.out.println(rq.dequeue());
		}
	}
}