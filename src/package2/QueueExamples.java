package package2;

import java.util.*;
public class QueueExamples {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>(); //We can use LinkList also
		queue.add("Apple");
		queue.add("Mango");
		queue.add("Grapes");
		queue.add("Banana");
		queue.remove("Grapes");
		System.out.println(queue);
		queue.offer("Guava");
		queue.offer("Orange");
		queue.add("Berry");
		queue.remove (); // Remove from the first.
		System.out.println(queue);
		System.out.println("Queue total Size: " + queue.size());
		System.out.println("Queue includes fruit 'Apple'? : " + queue.contains("Apple"));
		queue.clear();
	}

}

