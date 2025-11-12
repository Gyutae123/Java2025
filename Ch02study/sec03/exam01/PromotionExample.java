package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytevalue = 10;
		int intValue = bytevalue;
		System.out.println("intValue : "+ intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: "+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("double: " + doubleValue);
	}

}
