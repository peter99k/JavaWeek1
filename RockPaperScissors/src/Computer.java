import java.util.Random;

public class Computer extends Player {
	
	String compInput = "";
	int rock = 0;
	int paper = 0;
	int scissors = 0;

	public Computer() {

	}

	public String move() {

		Random randomGenrator = new Random();

		int randomNumber = randomGenrator.nextInt(3) + 1;
		

	
		switch (randomNumber) {
		case 1:
			compInput = "rock";
			this.rock++;
			break;
		case 2:
			compInput = "paper";
			this.paper++;
			break;
		case 3:
			compInput = "scissors";
			this.scissors++;
			break;
		
		}

		return input;
	}
}
