
public class Motorcycle extends Vehicle{
	
	public int wheelNumber;
	public int engineSize;
	
	public Motorcycle(String brand, String reg, String colour, String type, String id, int wheelNumber, int engineSize) {
		super(brand, reg, colour, type, id);
		this.wheelNumber = wheelNumber;
		this.engineSize = engineSize;
		
	}
	
	public String toString() {
		return super.toString() + " " + this.wheelNumber + " " + this.engineSize;
	}
}
