package sec03.exam1;

import java.util.Iterator;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 91, 75, 84, 83, 87 };

		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("Sum : " + sum);

		//자바의 foreach문
		for (int score : scores) {
			sum += score;
		}
		System.out.println("Sum : " + sum); // 혼공자 메모리 설명 그림 잘 확인해보기

	}

}
