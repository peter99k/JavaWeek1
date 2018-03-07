import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Player user = new Player();
		Computer comp = new Computer();

		//manager.startGame(user, comp);
		
		for(int i = 0; i < 10; i++) {
			Random randomGenrator = new Random();

			int randomNumber = randomGenrator.nextInt(3) + 1;
			
			System.out.println(randomNumber);
		}
	}

}
