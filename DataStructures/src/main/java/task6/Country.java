package task6;

import java.util.HashSet;
import java.util.Set;

public class Country {
	private String name;

	private Set<City> cities;

	public Country(String name) {
		this.name = name;
		this.cities = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public Set<City> getCities() {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Country country = (Country) o;

		if (!name.equals(country.name)) return false;
		return cities.equals(country.cities);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + cities.hashCode();
		return result;
	}
}
