package exam06;

public class PrintStop extends Thread{
	public void run() {
		while (true) {
			System.out.println("Running~");
			
			if(Thread.interrupted())
				break;
		}
		
		System.out.println("Terminating~");
	}
}
