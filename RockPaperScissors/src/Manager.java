
public class Manager {

	int humanWins = 0;
	int computerWins = 0;
	int ties = 0;
	int humanPaper = 0;
	int humanRock = 0;
	int humanScissors = 0;

	int gameCount = 0;

	public Manager() {

	}

	public void startGame(Player user, Computer comp) {

		System.out.println("Welcome to Classic Rock, Paper, Scissors!");
		System.out.println("To start please choose your first move...");

		do {
			gameCount++;
			user.move();
			comp.move();

			System.out.println("Human chose: " + user.input);

			System.out.println("Computer chose: " + comp.input);

			System.out.println(compareArgs(user.input, comp.input));

			user.continueGame();

		} while (user.continueGame() == "yes" || user.continueGame() == "Yes");

	}

	public String compareArgs(String userInp, String compInp) {
		String result = "";

		if (userInp == "rock" && compInp == "rock") {
			result = "You and the Computer Both Chose Rock. It's a Tie!";
			ties++;
			humanRock++;
		} else if (userInp == "paper" && compInp == "paper") {
			result = "You and the Computer Both Chose Paper. It's a Tie!";
			ties++;
			humanPaper++;
		} else if (userInp == "scissors" && compInp == "scissors") {
			result = "You and the Computer Both Chose Scissors. It's a Tie!";
			ties++;
			humanScissors++;
		}

		else if (userInp == "rock" && compInp == "scissors") {
			result = "You Chose Rock and the Computer Chose Scissors. You Win!";
			humanWins++;
			humanRock++;
		} else if (compInp == "rock" && userInp == "scissors") {
			result = "You Chose Scissors and the Computer Chose Rock. You Lose!";
			computerWins++;
			humanScissors++;
		} else if (userInp == "scissors" && compInp == "paper") {
			result = "You Chose Scissors and the Computer Chose Paper. You Win!";
			humanWins++;
			humanScissors++;
		} else if (compInp == "scissors" && userInp == "paper") {
			result = "You Chose Paper and the Computer Chose Scissors. You Lose!";
			computerWins++;
			humanPaper++;
		} else if (userInp == "paper" && compInp == "rock") {
			result = "You Chose Paper and the Computer Chose Rock. You Win!";
			humanWins++;
			humanPaper++;
		} else if (compInp == "paper" && userInp == "rock") {
			result = "You Chose Paper and the Computer Chose Rock. You Lose!";
			computerWins++;
			humanRock++;
		} else {
			result = "Invalid Input. Please Re-Enter. ";
			System.out.println();
		}

		return result;
	}
}
