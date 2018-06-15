package task3;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;

	private List<City> cities;

	public Country(String name) {
		this.name = name;
		this.cities = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void addCity(City city) {
		city.setCountry(this);
		cities.add(city);
	}

	@Override
	public String toString() {
		return "Country{" +
				"name='" + name + '\'' +
				", cities=" + cities +
				'}';
	}
}
