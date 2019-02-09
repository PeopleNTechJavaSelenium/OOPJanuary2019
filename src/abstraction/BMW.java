package abstraction;

public class BMW extends MotorVehicle implements Car{


	public void shape() {
		System.out.println("should not be more than 5.5 feet width");
	}

	public void wheels() {
		System.out.println("run on 4 wheels but much stronger tire");
		
	}

	public void start() {
		System.out.println("car should be able to run on pressing start button with remote");
		
	}

	public void stop() {
		System.out.println("should have ceramic break system to stop the car");
	}

	public void autoStart() {
		System.out.println("People in North America need auto start features more reliable");
	}

}
