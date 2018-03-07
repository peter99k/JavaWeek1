
public class Car extends Vehicle {
	
	public int doorNumber;
	public String winNumber;
		
	public Car(String brand, String reg, String colour, String type, String id, int doorNumber, String winNumber) {
		super(brand, reg, colour, type, id);
		this.doorNumber = doorNumber;
		this.winNumber = winNumber;		
		
	}
	
	public String toString() {
		return super.toString() + " " + this.doorNumber + " " + this.winNumber;
	}
}

