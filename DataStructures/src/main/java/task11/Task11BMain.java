package task11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task11BMain {
	public static void main(String[] args) {
		City gdansk = new City("Gdańsk", "Pomorskie", 500_000);
		City warszawa = new City("Warszawa", "Mazowieckie", 1_700_000);
		City bartoszyce = new City("Bartoszyce", "Warmińsko-Mazurskie", 30_000);

		List<City> cities = Arrays.asList(gdansk, warszawa, bartoszyce);

		Collections.sort(cities);

		System.out.println(cities);
	}
}
