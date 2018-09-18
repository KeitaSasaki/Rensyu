package Tramp;

public class Card {
	String suit;
	int number;

	//コンスト
	public Card(String suitaaa, int number) {
		this.suit = suitaaa;
		this.number = number;
	}

	public String getNumber() {
		return Integer.toString(number);
	}

	public String getSuit() {
		return suit;
	}

}
