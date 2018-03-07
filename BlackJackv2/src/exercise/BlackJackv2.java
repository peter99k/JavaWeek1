package exercise;

public class BlackJackv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(blackJack(18,21));
		System.out.println(blackJack(20,18));
		System.out.println(blackJack(22,22));
		System.out.println(blackJack(1,1));

	}
	public static int blackJack(int cardOne, int cardTwo) {
		int winner = 21; 
		int cardOneWin = 1;
		int cardTwoWin = 2;
		int draw = 3;
		int noWinners = 4;
		if((cardOne > 0 && cardTwo > 0) && (cardOne < 22 && cardTwo < 22) && (cardOne != cardTwo)) {
			int resultOne = winner - cardOne;
			int resultTwo = winner - cardTwo;
			if(resultOne < resultTwo) {
				return cardOneWin;
			}
			else {
				return cardTwoWin;
			}
		}
		else if ((cardOne == cardTwo) && (cardOne < 22 && cardTwo < 22)) {
			return draw;
		}
		else {
			return noWinners;
		}
	}
}
