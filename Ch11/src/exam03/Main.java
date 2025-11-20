package exam03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = new String("Hi");
		String string2 = new String("Hi");
		
		if(string1 == string2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");

		}
		if(string1.equals(string2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");

		}
		
	}

}
