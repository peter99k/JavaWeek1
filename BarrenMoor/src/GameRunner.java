import java.util.*;
//import java.lang.*;

public class GameRunner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p = new Player();
		Treasure t = new Treasure();
		Swamp s = new Swamp();
		
		checkUniquePositions(p, t);
		
		s.swampGrid[p.locationX][p.locationY] = 1;
		s.swampGrid[t.treasureLocationX][t.treasureLocationY] = 2;
		
		System.out.println(s.narrative());
		
		Scanner sc = new Scanner(System.in);
		
		while((p.getPlayerLocationX() != t.getTreasureLocationX()) && (p.getPlayerLocationY() != t.getTreasureLocationY())) {
			System.out.println("Which way would you like to go?");
			String move = sc.nextLine();
			s.movement(p,move);
			//System.out.println(p.checkPlayerLocation());
			if((p.getPlayerLocationX() == t.getTreasureLocationX()) && (p.getPlayerLocationY() == t.getTreasureLocationY())) {
				System.out.println("You found the treasure! You won!!!");
				break;
			}
		}
	}

	public static void checkUniquePositions(Player p, Treasure t) {
		while ((p.getPlayerLocationX() == t.getTreasureLocationX()) && (p.getPlayerLocationY() == t.getTreasureLocationY())) {
			p.setPLayerLocationX();
			p.setPLayerLocationY();
		}
	}

}
