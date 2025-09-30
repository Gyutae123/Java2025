package sec01.exam1;

public class Car {
	String company;
	int maxSpeed;
	int speed;
	int rpm;
	char test;
	
//	public void Car() {
//		
//	}
	
	public Car (String company, int maxSpeed) {
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
	
//	public Car () {
//		
//	}
	
	public void SetMaxSpeed(int value) {
		maxSpeed = value;
	}
	
	public void showInfo() {
		System.out.println(company);
		System.out.println(test);
		System.out.println("Company : " + company);
		System.out.println("Max Speed : " + maxSpeed);
		System.out.println("Current speed : " + speed);
		System.out.println("Current RPM : " + rpm);
	}
	
	public void hi() {
		int value = 0;
		System.out.println("Value : " + value);
	}
}
