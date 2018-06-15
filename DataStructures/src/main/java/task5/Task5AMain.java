package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Task5AMain {
	public static void main(String[] args) {
		String filePath = Task5AMain.class.getResource("/tasks/5/stos.txt").getFile();
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
//			System.out.println(lines);
			int tests = Integer.parseInt(lines.get(0));

			String result = "";
			for (int i = 0; i < tests; i++) {
				String line = lines.get(i + 1);
				result += line + " => ";

				Deque<String> deque = new LinkedList<>();
				String[] lineItems = line.split(" ");
				for (String item : lineItems) {
					if ("pop".equals(item)) {
						deque.pop();
					} else {
						deque.push(item);
					}
				}

				result += deque + "\n";
			}
			System.out.print(result);
			Files.write(Paths.get("./stos-out.txt"), result.getBytes(), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
