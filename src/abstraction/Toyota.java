package abstraction;

public class Toyota extends MotorVehicle implements Car{

	public Toyota() {}
	public Toyota(String model, int year) {
		super(model,year);
	}
	public void shape() {
		System.out.println("should not be more than 5 feet width");
		
	}
	public void wheels() {
		System.out.println("run on 4 wheels");
		
	}
	public void start() {
		System.out.println("car should be able to run on pressing start button");
	}
	public void stop() {
		System.out.println("should have break system to stop the car");
		
	}
	
	public void color() {
		System.out.println("we are offering different color of different models");
	}
	public void autoStart() {
		System.out.println("People in North America need auto start features");
	}

}
