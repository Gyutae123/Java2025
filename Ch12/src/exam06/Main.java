package exam06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PrintThread1 thread = new PrintThread1();
//		thread.start();
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		thread.SetStop(true);
 // 김규태
//		PrintThread2 thread = new PrintThread2();
//		thread.start();
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		thread.interrupt();
		PrintStop thread = new PrintStop();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread.interrupt();
	}

}
