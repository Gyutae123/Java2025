package sec04.exam1;

import java.io.IOException;
import java.util.Scanner;

public class ReadTest {
	
	public static void main(String[] args) {
//		while(true) {
//			try { //예외처리
//				int code = System.in.read(); //키보드입력 받음
//				System.out.println("Code: " + code);
//			
//				if(code == 'q') break;
//			
//			} catch (IOException e) { //예외값처리
//				e.printStackTrace();
//			}
//		}
//		Scanner scan = new Scanner(System.in);// 요즘은 키입력 이걸로 씀
//		 while(true) {
//			 int code = scan.nextInt();
//			 System.out.println("Code: " + code);
//			 if(code == 'q')
//				 break;
//		 }
		 Scanner scan = new Scanner(System.in);
		 while(true) {
			 String code = scan.nextLine();
			 System.out.println("Code: " + code);
			 if(code.equals("q"))
				 break;
			 
		 }// 
	}
}
