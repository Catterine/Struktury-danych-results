package task3;

import java.util.ArrayList;
import java.util.List;

public class Task3AMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //tworzenie listy
		list.add("A"); // dodawanie obiektów do tej listy
		list.add("B");
		list.add("C");

		String item = list.get(1);
		list.remove(1);

		System.out.println(list);
	}
}
