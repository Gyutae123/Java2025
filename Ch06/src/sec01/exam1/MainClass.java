package sec01.exam1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stl= new Student();
		stl.SayHello();
		Car c = new Car("현대", 250);
		
//		c.SetMaxSpeed(100);
		//c.maxSpeed = 200;
//		c.showInfo();
		Calcul cal = new Calcul();
		Double val = cal.add(1.0, 3.0);
		System.out.println("Value : " + val);
		
	}

}