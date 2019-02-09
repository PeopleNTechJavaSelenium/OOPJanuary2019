package abstraction;

public abstract class MotorVehicle extends Ford implements Boat{
    String model;
    int year;
	public MotorVehicle() {}
	public MotorVehicle(String model) {
		this.model = model;
		System.out.println(this.model);
	}
    public MotorVehicle(String model, int year) {
		this.model = model;
		this.year = year;
		System.out.println(this.model + " "+ this.year);
	}
	public void engine() {
		System.out.println("Let's have an engine to start the car");
	}
	
	public abstract void autoStart();
	
	public void floatingShape() {
		System.out.println("Vehicle that can float in water");
	}
	
	public void sail() {
		System.out.println("Let's have sail features to move the boat");
	}
}
