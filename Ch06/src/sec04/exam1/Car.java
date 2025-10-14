package sec04.exam1;

public class Car {
	int gas;
	int minGas; // 한바퀴 돌 때 필요한 gas
	String teamName;
	String color;
	static int numberOfCars;
	
	
	Car(int gas, int minGas, String teamName, String color) {
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
		
	}

	boolean IsLeftGas() {
		if (gas < minGas) {
			System.out.println("연료를 보충해야 합니다.");
			return false;
		}
		System.out.println("한바퀴 더 돌 수 있어요.");
		return true;
	}

	void AddGas(int gas) {
		System.out.println("연로 만땅.");
		this.gas = gas;
	}

	void RunOneRound() {
		System.out.println("한바퀴 완주");
		this.gas -= minGas;
	}

//	void Test() {
//		RunOneRound();
//	}

	int Plus(int a, int b) {
		return a + b;
	}
//	int Plus(int b, int a) {
//		return a+b;
//	}

	double Plus(double a, double b) {
		return a + b;
	}
	
	double Plus(int b, double a) {
		return a + b;
	}
	
	double Plus(int b) {
		return b;
	}
	
	static void ShowNumberOfCars() {
		System.out.println("Number Of Cars : " + numberOfCars);
	}
}
