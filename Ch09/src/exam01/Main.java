package exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		button.SetOnClickListener(new CallListener());
		button.Touch();
		
		Button mButton = new Button();
		mButton.SetOnClickListener(new MessageListener());
		mButton.Touch();
	}

}
