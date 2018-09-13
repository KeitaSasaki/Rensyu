package Tramp;

import java.util.LinkedList;

public class Deck {

	String[] suitaaa = { "スペード", "クローバー", "ダイヤ", "ハート" };
	String joker = "ジョーカー"; //ジョーカーのsuit
	int jokernum = 14; //ジョーカーのnumber
	LinkedList<Card> deck; //リスト作成

	public void make() {
		deck = new LinkedList<Card>();
		for (int i = 1; i <= 52; i++) {
			for (int j = 1; j < suitaaa.length; i++) {
				deck.add(new Card(suitaaa[i], j));
			}
		}
		for (int n = 1; n <= 2; n++) {
			deck.add(new Card(joker, jokernum));
		}
	}

	public Card drow() {
		Card deckdrow = (Card) deck.get(0);
		return deckdrow;
	}
}
