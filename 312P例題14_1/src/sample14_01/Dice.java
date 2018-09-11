package sample14_01;

public class Dice {
	int val; //目数

	//コンストラクタ
	public Dice(int val) {
		this.val = val; //thisはフィールド変数を示す
	}

	public void play() {
		val = (int) (Math.random() * 6) + 1;
	}
}
