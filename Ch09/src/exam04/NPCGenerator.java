package exam04;

public class NPCGenerator {
	Person worker = new Person() {
		void Wake() {
			System.out.println("Wake up at 9!!");
			Work();
		}

		void Work() {
			System.out.println("Go to Work!!");
		}
	};

	void GeneratorPerson(Person person) {
		person.Wake();
	}
}
