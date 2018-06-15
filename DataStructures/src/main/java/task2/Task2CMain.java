package task2;

public class Task2CMain {
	public static void main(String[] args) {
		City gdansk = new City("Gdańsk", "Pomorskie", 500_000);
		City warszawa = new City("Warszawa", "Mazowieckie", 1_700_000);

		Country poland = new Country("Poland", new City[]{gdansk, warszawa});

		for (City city : poland.getCities()) {
			System.out.println(city);
		}
	}
}
