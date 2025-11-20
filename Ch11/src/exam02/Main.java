package exam02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 = new Test(123);
		Test test2 = new Test(123);
		Object object = test1;
		
		if(test1.equals(test2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");

		}

	}

}
