package task14;

import task13.Task13AMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Task14AMain {

	private static Map<String, Integer> words, characters;

	public static void main(String[] args) {
		String filePath = Task13AMain.class.getResource("/tasks/14/f.txt").getFile();

		try {
			words = new HashMap<>();
			characters = new HashMap<>();
			String text = new String(Files.readAllBytes(Paths.get(filePath)));

			for (String c : text.split("\\s+")) {
				words.put(c, words.getOrDefault(c, 0) + 1);
			}
			for (String c : text.split("")) {
				characters.put(c, characters.getOrDefault(c, 0) + 1);
			}

			System.out.println("words => " + words);
			System.out.println("characters => " + characters);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
