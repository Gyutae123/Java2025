package exam03;

public class Main {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Button callButton = new Button();
		callButton.SetOnClickListener(
				new Button.onClickListener() {
					
					@Override
					public void onClick() {
						// TODO Auto-generated method stub
						System.out.println("Make a Phone!");
					}
				}
				);
			callButton.Touch();
	}

}
