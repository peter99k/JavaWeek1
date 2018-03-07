import java.util.Scanner;

public class Player {

	String input;

	public Player() {

	}

	public String move() {
		Scanner sc = new Scanner(System.in);
		this.input = sc.nextLine();
		sc.close();

		return this.input;
	}

	public String continueGame() {
		String yorno = "";

		Scanner sc = new Scanner(System.in);
		yorno = sc.nextLine();

		if (yorno != "yes" || yorno != "no") {
			System.out.println("Please enter 'yes' or 'no':");
		} else if (yorno == "yes") {
			System.out.println("Great, Lets Play!");
			sc.close();

		} else {
			System.out.println("See you later!");
			sc.close();
		}
		return yorno;
	}
}
