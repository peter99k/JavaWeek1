
public class Player {
	
	int locationX;
	int locationY;
		
	public Player() {
		
		this.locationX = (int) Math.round(Math.random()*4);
		this.locationY = (int) Math.round(Math.random()*4);
	}
	
	public void setPLayerLocationX() {
		this.locationX = (int) Math.round(Math.random()*4);
	}
	
	public void setPLayerLocationY() {
		this.locationY = (int) Math.round(Math.random()*4);
	}
	
	public int getPlayerLocationX() {
		return locationX;
	}
	
	public int getPlayerLocationY() {
		return locationY;
	}
	
	
	
	public void addPlayer() {
		setPLayerLocationX();
		setPLayerLocationY();
	}
	
	public void checkPlayerLocation() {
		getPlayerLocationX();
		getPlayerLocationY();
	}
	
	public String promptUser() {
		return "Please enter the direction you'd like to follow in the format: "
				+ "'North', 'South', 'East', 'West', 'Northeast', 'Northwest', 'Southeast', 'Southwest'";
	}
}
