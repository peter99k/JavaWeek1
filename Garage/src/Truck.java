
public class Truck extends Vehicle{
	
	public int mileage;
	
	public Truck(String brand, String reg, String colour, String type, String id, int mileage) {
		super(brand, reg, colour, type, id);
		this.mileage = mileage;
				
	}
	
	public String toString() {
		return super.toString() + " " + this.mileage;
	}
}
