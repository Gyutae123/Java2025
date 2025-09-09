package sec03;

public class PromotionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteVal = 10;
		int intVal = byteVal;
		
		//byte  byteVall = intVal;
		
		char charVal = 'A';
		//char charVal = 65;
		//System.out.println(charVal);
		int intVall = charVal;
		System.out.println(intVall);
		System.out.println((char)intVall);
		System.out.println((int)charVal);
		
		byte byteVal1 = 65;
		char charVal1 = (char)byteVal1;
		System.out.println(charVal1);

	}

}
