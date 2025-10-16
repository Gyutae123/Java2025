package sec01.exam1;

public class Truck extends Car{
	int speed;
	int load;
	
	Truck(int speed, int load){
		super(speed);
//		this.speed = speed;
		this.load = load;
	}
	
	void ShowSpeed(int speed) {
		System.out.println("Truck speed : " + speed);
	}
	
	void ShowLoad() {
		System.out.println("Truck load : " + load);
	}

}
