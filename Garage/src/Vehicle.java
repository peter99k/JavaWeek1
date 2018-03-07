
public abstract class Vehicle {
	
	String brand;
	String reg;
	String colour;
	String type;
	String id;
		
	public Vehicle(String brand, String reg, String colour, String type, String id) {
		this.brand = brand;
		this.reg = reg;
		this.colour = colour;
		this.type = type;
		this.id = id;
	}
	
	public boolean needsFixing(char input) {
		if (input == 'Y') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return this.brand + " " + this.reg + " " + this.colour + " " + this.type + " " + this.id; 
	}
	
	public String getReg() {
		return this.reg;
	}
}
