package task11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task11AMain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ala", "Tomek", "Marian", "Magda");

		Collections.sort(list);

		System.out.println(list);
	}
}
