package exam02;

public class OutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1;
		String data2;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Array Index Exception");
		}

//		System.out.println("args[0] : " + data1);
//		System.out.println("args[1] : " + data2);

	}

}
