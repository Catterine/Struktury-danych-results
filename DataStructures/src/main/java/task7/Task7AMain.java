package task7;

import task6.Person;
import task6.Task6AMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Task7AMain {
	public static void main(String[] args) {
		String filePath = Task6AMain.class.getResource("/tasks/6/set.txt").getFile();
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			Map<String, Set<Person>> map = new HashMap<>();
			for (String line : lines) {
				Person person = Person.fromString(line);
				if (!map.containsKey(person.getSurname())) {
					map.put(person.getSurname(), new HashSet<>());
				}
				map.get(person.getSurname()).add(person);
			}

			System.out.println(map);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
