package task13;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Task13AMain {
	public static void main(String[] args) {
		String filePath = Task13AMain.class.getResource("/tasks/13/f.txt").getFile();

		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));

			Deque<String> deque = new LinkedList<>();
			lines.forEach(deque::push);

			while (!deque.isEmpty()) {
				System.out.println(deque.pop());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
