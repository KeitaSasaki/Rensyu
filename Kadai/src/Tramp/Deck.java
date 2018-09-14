package Tramp;

import java.util.LinkedList;

public class Deck {
	int index;
	String[] suitaaa = { "スペード", "クローバー", "ダイヤ", "ハート" };
	String joker = "ジョーカー"; //ジョーカーのsuit
	int jokernum = 14; //ジョーカーのnumber
	LinkedList<Card> deck; //リスト作成
	int cardnum = 0;
	Card drawcard = draw();

	public void make() {
		deck = new LinkedList<Card>();
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
		deck.get(0);
		return drawcard;
	}

	public void go() {
		System.out.println(this.drawcard);
	}

}
