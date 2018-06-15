package task3;

;

public class Task3CMain {
	public static void main(String[] args) {
		City gdansk = new City("Gdańsk", "Pomorskie", 500_000);
		City warszawa = new City("Warszawa", "Mazowieckie", 1_700_000);

		Country poland = new Country("Poland");
		poland.addCity(gdansk);
		poland.addCity(warszawa);

		for (City city : poland.getCities()) {
			System.out.println(city);
		}
	}
}
