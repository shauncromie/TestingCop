
public class HelloWorld {

	public static void main(String[] args) {
		/*
		String mitext = "hello world 123 !@@!@$$!";
		System.out.println(mitext);
*/
		Car shaunCar = new Car();
		shaunCar.regNr = "TGT 789 GP";
		shaunCar.turnLeft();
		shaunCar.turnRight();
		shaunCar.moveForward();
		shaunCar.brake();
		
		Car cindyCar = new Car();
		cindyCar.regNr = "OPL 678 GP";
		cindyCar.brake();
				
		
	}

}
