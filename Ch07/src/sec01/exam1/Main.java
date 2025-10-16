package sec01.exam1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car(100);
		Car car;

		Truck truck = new Truck(80, 200);

//		car.ShowSpeed();
		
		truck.ShowSpeed();
		truck.ShowSpeed(60);
		
		car = truck;
		car.ShowSpeed();
		
		System.out.println("Car speed is " + car.speed);

	}

}
