package Tramp;

import java.util.ArrayList;

public class Deck {
	int index;
	String[] suitaaa = { "スペード", "クローバー", "ダイヤ", "ハート" };
	String joker = "ジョーカー"; //ジョーカーのsuit
	int jokernum = 14; //ジョーカーのnumber
	ArrayList<Card> deck; //リスト作成
	int cardnum = 0;

	public void make() {
		deck = new ArrayList<Card>();
		int count = 1;
		for (cardnum = 1; cardnum <= 13; cardnum++) { //たぶんおけ
			for (int j = 0; j < suitaaa.length; j++) {
				deck.add(new Card(suitaaa[j], cardnum));
				System.out.println("作ったよ" + count);
				count++;
			}
		}
		for (int n = 0; n <= 1; n++) {
			deck.add(new Card(joker, jokernum)); //たぶんおけ
			System.out.println("jokerを作ったよ" + count);
			count++;
		}
	}

	public Card draw() {
		Card drawcard = deck.get(0);
		deck.remove(0);
		return drawcard;
	}

}
