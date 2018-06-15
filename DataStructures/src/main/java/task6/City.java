package task6;

public class City {
	private String name;
	private String province;
	private long population;
	private Country country;

	public City(String name, String province, long population) {
		this.name = name;
		this.province = province;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City{" +
				"name='" + name + '\'' +
				", province='" + province + '\'' +
				", population=" + population +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		City city = (City) o;

		if (population != city.population) return false;
		if (!name.equals(city.name)) return false;
		if (!province.equals(city.province)) return false;
		return country.equals(city.country);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + province.hashCode();
		result = 31 * result + (int) (population ^ (population >>> 32));
		result = 31 * result + country.hashCode();
		return result;
	}
}
