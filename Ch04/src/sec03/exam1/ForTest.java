package sec03.exam1;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int x = 0; x < 10; x++) {
//			for(int y = 0; y < 10; y++) {
//				System.out.println("(" + x + ", " + y + ")");
//				if(x == 5 && y == 5)  // 두번쨰 반복문 5,5에서 빠져나간후 6,0부터 다시실행
//					break;
//			}
//		}
		Out: for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.println("(" + x + ", " + y + ")");
				if(x == 5 && y == 5)
					break Out; // 전체 탈출
			}
		}
		
	}

}
