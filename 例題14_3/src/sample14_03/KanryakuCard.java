package sample14_03;

public class KanryakuCard {
	int val; //目数
	String color; //色

	public void KanryakuCard(int val, String color) { //サンプルコードはvoid無いがエラー吐くためvoidを書いた
		this.val = val;
		this.color = color;
	}

	public KanryakuCard(String color) {
		KanryakuCard(1, color);
	}

	public KanryakuCard() {
		KanryakuCard(1, "白");
	}

	/*
	 * ↓を簡略化したものが↑
	public KanryakuCard(int val, String color) {
		this.val = val;
		this.color = color;
	}
	
	public KanryakuCard(String color) {
		this.color = "白";
	}
	
	public KanryakuCard() {
		this.val = 1;
	}
	 */
}
