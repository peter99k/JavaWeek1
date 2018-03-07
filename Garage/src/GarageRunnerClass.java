
public class GarageRunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage garage = new Garage();
		
		garage.addVehicle(new Car("BMW", "HG67 JUH", "white", "car", "gh567", 4, "5756"));
		garage.addVehicle(new Car("Audi", "KO66 ABC", "black", "car", "khk98", 3, "985643"));
		garage.addVehicle(new Car("Toyota", "XY55 XYZ", "grey", "car", "dasd3", 2, "fs464ds"));
		garage.addVehicle(new Motorcycle("Yamaha", "ER67 HJK", "red", "motorcycle", "dwd45", 2, 1000));
		garage.addVehicle(new Motorcycle("Honda", "QQ67 KJH", "blue", "motorcycle", "167kj", 2, 2000));
		garage.addVehicle(new Motorcycle("Harley Davidson", "JK65 UIO", "brown", "motorcycle", "90909", 3, 1600));
		garage.addVehicle(new Truck("Volvo", "LH13 JUH", "pink", "truck", "8989kklk", 12000));
		garage.addVehicle(new Truck("Mac", "GH55 GSF", "purple", "truck", "sadasda87", 27098));
		garage.addVehicle(new Truck("Scania", "QA66 TTT", "green", "truck","dghs23526", 1000000));
		garage.addVehicle(new Truck("Scania", "QA66 TTT", "green", "truck","dghs23526", 1000000));
		garage.addVehicle(new Truck("Scania", "QA66 TTT", "green", "truck","dghs23526", 1000000));
		
		garage.displayVehicles();
		
	}

}
