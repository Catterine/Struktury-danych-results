package task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task6AMain {
	public static void main(String[] args) {
		String filePath = Task6AMain.class.getResource("/tasks/6/set.txt").getFile();
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			Set<Person> persons = new HashSet<>();

			for (String line : lines) {
				persons.add(Person.fromString(line));
			}

			System.out.println(persons.size());
			System.out.println(persons);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
