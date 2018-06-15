package task2;

public class City {
	private String name;
	private String province;
	private long population;

	public City(String name, String province, long population) {
		this.name = name;
		this.province = province;
		this.population = population;
	}

	@Override
	public String toString() {
		return "City{" +
				"name='" + name + '\'' +
				", province='" + province + '\'' +
				", population=" + population +
				'}';
	}
}
