package 練習14_1;

public class Card {
	String suit;
	int number;

	String face() {
		return suit + "/" + number; //カードを表す文字列を返す
	}

	public Card(String suit, int number) {
		this.suit = suit;
		this.number = number;
	}

	public void disp() {
		System.out.println(face());

	}

}
