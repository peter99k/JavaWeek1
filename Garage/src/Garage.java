import java.util.*;

public class Garage {
	
	int dailyPrice = 200;
	
	private ArrayList<Vehicle> garage = new ArrayList<>();   //might be worthwhile changing to List<Vehicle> vehicleList = ArrayList<Vehicle>();
	
	public Garage() {
		
	}
	/*public void addVehicle(Vehicle vehicle) {
			this.garage.add(vehicle);
	}*/
	public void removeVehicle(Vehicle vehicle) {
			this.garage.remove(vehicle);
	}
	public boolean fixVehicle(Vehicle vehicle) {
			if (vehicle.needsFixing('Y')) {
				return true;
			}
			else {
				return false;
			}
	}
	public void emptyGarage() {
			for(Vehicle v : garage) {
				garage.remove(v);
			}
	}
	public String calcBill(int length) {
			int bill = length * dailyPrice;
			return "The total bill is: " + "£" + bill;
	}
	public void displayVehicles() {
		for (Vehicle v : garage) {
			System.out.println(v.toString());
		}
	}
	/*public boolean vehicleExists(Vehicle vehicle) {
		for(Vehicle v : garage) {
			if (vehicle instanceof Vehicle) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}*/
	public void clearGarage() {
//		if (garage.size() > 0) {
//			for(Vehicle v : garage) {
//				garage.remove(v);
//			}
//		}
		garage.clear();
	}
	public void addVehicle(Vehicle vehicle) {
		if(!vehicleExists(vehicle)) {
			this.garage.add(vehicle);
		}
	}
	public boolean isEmpty() {
		if(garage.size() > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean vehicleExists(Vehicle vehicle) {
		boolean result = false;
		for(Vehicle v : garage) {
			if(v.getReg().equals(vehicle.getReg())) {
				result = true;
			}
		}
		return result;
	}
	public ArrayList<Vehicle> getGarage() {
		return garage;
	}
}
