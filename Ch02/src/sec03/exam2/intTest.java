package sec03.exam2;
import java.util.Scanner; 
public class intTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		byte val1 = 1;
		byte val2 = 2;
		
		//byte val3 = val1 + val2; <- byte끼리 더하면 4byte(int)단위로 처리하기 때문에 int로 선언해야함
		int val3 = val1 + val2;
		System.out.println(val3);
		
		/* System.out.println(1 / 2);
		System.out.println("1/2: " + 1 / 2);
		System.out.println(1.0 / 2.0);
		System.out.println("1.0/2.0: " + 1.0 / 2.0); */
		
		String str = "10";
		int value = 20;
		String str1 = str + value;
		System.out.println(str1); //1020
		String str2 = "" + value; //간단하게 int > String으로 바꿀때 이렇게 써도 됨
		System.out.println(str2);
		//int result = val1 + str; <- 타입이 안맞음 str을 int형으로 바꿔줘야함
		int result = val1 + Integer.parseInt(str);
		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();//입력값을 정수로 바꿈
		System.out.println(input);
		
	}

}
