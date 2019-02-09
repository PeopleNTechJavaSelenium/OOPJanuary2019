package abstraction;

public interface Car {
	public abstract void shape();
    public void wheels();
    public void start();
    public void stop();
    
    public static void carBody() {
    	System.out.println("Car body must be strong enough to drive in highway");
    }
    
}
