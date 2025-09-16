package sec03.exam3;

public class ValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		System.out.println(value);
		
		String str = "3" + 7; // str + int는 둘다 str로 취급
		System.out.println(str);
		
		String str1 = "3" + 7 + 8; // str을 먼저 더해서 int + int도 문자열취급
		System.out.println(str1);
		
		String str2 = 7 + 8 + "3"; // int형 먼저 더한후 str로 문자열 이어짐
		System.out.println(str2);
		
		String cstr = " " + value;
		//시험 단골문제
	}

}
