package task4;

import java.util.LinkedList;
import java.util.Queue;

public class Task4AMain {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		queue.add("Ala");
		queue.add("Tomek");
		queue.add("Jan");

		System.out.println(queue);

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
