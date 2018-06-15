package task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3BMain {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			list.add(random.nextInt(11));
		}

		System.out.println(list);
	}
}
