package exam03;

public class Main {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Button button = new Button();
		Button.onClickListener callListener = new Button.onClickListener() {
			public void onClick() {
				System.out.println("Make a call!!");
			}
			};
			button.SetOnClickListener(callListener);
			button.Touch();
			button.SetOnClickListener(callListener);
			new Button.onClickListener() {
				public void onClick() {
					System.out.println("Send a message!!");
				}
			};
			button.Touch();
		}
		
}
