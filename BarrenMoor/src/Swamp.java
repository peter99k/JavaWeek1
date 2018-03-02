
public class Swamp {

	int[][] swampGrid = new int[5][5];

	public Swamp() {

	}

	public String narrative() {
		return "Grey foggy clouds float oppressively close to you,\r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "Try \"north\",\"south\",\"east\",or \"west\"\r\n"
				+ "You notice a small watch-like device in your left hand. \r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time.\r\n" + "";
	}

	public void movement(Player p, String move) {
		
		switch (move) {

		case "north":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationX = p.locationX + 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "south":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationX = p.locationX - 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "east":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationY = p.locationY + 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "west":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationY = p.locationY - 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "northeast":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationX = p.locationX + 1;
			p.locationY = p.locationY + 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "northwest":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationX = p.locationX + 1;
			p.locationY = p.locationY - 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "southeast":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationX = p.locationX - 1;
			p.locationY = p.locationY + 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		case "southwest":
			swampGrid[p.locationX][p.locationY] = 0;
			p.locationX = p.locationX - 1;
			p.locationY = p.locationY - 1;
			swampGrid[p.locationX][p.locationY] = 1;
			break;

		default:
			System.out.println(p.promptUser());
			break;
		}
	}
}
