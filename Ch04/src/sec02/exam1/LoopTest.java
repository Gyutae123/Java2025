package sec02.exam1;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		Scanner scan = new Scanner(System.in);
//		int choice = 0;
//		
//		while(choice != 1 && choice !=3) { //원하는 조건 설정후 반복
//			
//			System.out.println("========");
//			System.out.println("play game");
//			System.out.println("quit game");
//			System.out.println("========");
//			choice = scan.nextInt();
//		}
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		do { //while과 같지만 값을 먼저 출력후 조건문 반복
			
			System.out.println("========");
			System.out.println("play game");
			System.out.println("quit game");
			System.out.println("========");
			choice = scan.nextInt();
		} while(choice != 1 && choice !=3);	
	}

}
