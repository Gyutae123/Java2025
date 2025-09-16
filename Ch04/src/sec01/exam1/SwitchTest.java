package sec01.exam1;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 1;
		switch(val) {
		case 1:
			System.out.println("Code 1");
			break;
		case 2:
			System.out.println("Code 2");
			break;
		case 3:
			System.out.println("Code 3");
			break;
		default:
			System.out.println("No Code");
			break;
		}
		
		char val1 = '1';
		switch(val1) {
		case 1:
			System.out.println("Code 1");
			break;
		case 2:
			System.out.println("Code 2");
			break;
		case 46:
			System.out.println("Code 3");
			break;
		default:
			System.out.println("No Code");
			break;
		}
		
		String val2 = "mon";
		switch(val2) {
		case "wed":
			System.out.println("Code 1");
			break;
		case "mon":
			System.out.println("Code 2");
			break;
		case "sun":
			System.out.println("Code 3");
			break;
		default:
			System.out.println("No Code");
			break;
		}

	}

}
