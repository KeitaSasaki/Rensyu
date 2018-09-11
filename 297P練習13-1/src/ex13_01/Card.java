package ex13_01;

public class Card {
	String[] suitrandom = { "スペード", "ハート", "ダイヤ", "クローバー" };
	int suitrandomnum;
	String suit;
	int num;

	void play() {
		num = (int) (Math.random() * 13) + 1;
		suitrandomnum = (int) (Math.random() * 4);
		suit = (String) suitrandom[suitrandomnum];
		System.out.println("シャッフル処理をしました");
	}
}
