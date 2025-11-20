package exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		Object object2 = new Object();
		object2 = object;
		
		if(object == object2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		if(object.equals(object2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");

		}
	}

}
