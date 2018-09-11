package sample14_03;

public class Dice {
	int val;

	//コンストラクタ
	public Dice(int val) {
		this.val = val;
	}

	//オーバーロードはコンストラクタを複数定義するという意味
	public Dice() { //コンストラクタのオーバーロード
		val = 1;
	}

	public void play() {
		val = (int) (Math.random() * 6 + 1);
	}
}
