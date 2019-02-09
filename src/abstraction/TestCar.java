package abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car corolla = new Toyota();
		corolla.shape();
		corolla.start();
		corolla.stop();
		Car.carBody();
		
		Toyota lexus = new Toyota();
		lexus.color();
		
		MotorVehicle mv = new Toyota();
		mv.engine();
		mv.autoStart();
		
		Boat boat = new Toyota();
		boat.sail();
		
		Toyota highlander = new Toyota("highlander", 2019);
		highlander.autoStart();
		
		Car sevenSeries = new BMW();
		sevenSeries.start();
	}

}
