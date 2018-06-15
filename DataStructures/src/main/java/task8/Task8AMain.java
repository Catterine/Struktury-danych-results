package task8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class Task8AMain {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(Task8AMain.class.getResourceAsStream("/tasks/8/f.properties"));
			Enumeration<?> enumeration = properties.propertyNames();
			while (enumeration.hasMoreElements()) {
				String propertyName = enumeration.nextElement().toString();
				System.out.println(propertyName + " => " + properties.getProperty(propertyName));
			}

			properties.setProperty("newKey", "" + System.currentTimeMillis());

			properties.store(new FileOutputStream(Paths.get(".") + "/src/main/resources/tasks/8/f.properties"), null);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
