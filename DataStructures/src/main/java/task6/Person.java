package task6;

public class Person {  //zdefiniowanie klasy
	private String name;
	private String surname;
	private int age;

	public Person(String name, String surname, int age) { //obiekkt person, klasy person, o metodach
		this.name = name; //konstruktor
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public static Person fromString(String line) {
		String[] items = line.split(" "); //rozbijanie listy stringow na pojedyncze stringi
		Person person = new Person(items[0], items[1], Integer.parseInt(items[2]));

		return person;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;

		if (age != person.age) return false;
		if (!name.equals(person.name)) return false;
		return surname.equals(person.surname); //porownanie imion nazwisk z innymi - by się nie dublowały
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + surname.hashCode();
		result = 31 * result + age;
		return result;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age=" + age +
				'}';
	}
}
