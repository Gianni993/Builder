public class App {
    public static void main(String[] args) {
		Person person = Person.builder("giggio", "griggio")
				.withAge(18)
				.withAddress("via gelsomini 5")
				.build();
		System.out.println(person);
	}
}
