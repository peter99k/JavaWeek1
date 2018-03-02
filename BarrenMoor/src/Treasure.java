
public class Treasure {
	
	int treasureLocationX;
	int treasureLocationY;
	
	public Treasure() {
		
		this.treasureLocationX = (int) Math.round(Math.random()*4);
		this.treasureLocationY = (int) Math.round(Math.random()*4);
	}
	
	public void setTreasureLocationX() {
		this.treasureLocationX = (int) Math.round(Math.random()*4);
	}
	
	public void setTreasureLocationY() {
		this.treasureLocationY = (int) Math.round(Math.random()*4);
	}
	
	public int getTreasureLocationX() {
		return treasureLocationX;
	}
	
	public int getTreasureLocationY() {
		return treasureLocationY;
	}
	
	public void addTreasure() {
		setTreasureLocationX();
		setTreasureLocationY();
	} 
	
	public void checkTreasureLocation() {
		getTreasureLocationX();
		getTreasureLocationY();
	}
}
