package exam04;

public class ClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		ChangeDog(cat);
		System.out.println("program is running");
		try {
			Method();
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}

	public static void ChangeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
	
	public static void Method() throws Exception {
		System.out.println("Hi");
		}

}
