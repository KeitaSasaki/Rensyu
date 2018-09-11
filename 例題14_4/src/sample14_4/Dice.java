package sample14_4;

public class Dice {
	int val;
	String color;

	public Dice(int val, String color) {
		this.val = val; //thisはこのインスタンスのという意味
		this.color = color;
	}

	String face() {
		return val + "/" + color; //カードを表す文字列を返す
	}

	public Dice(String color) {
		this(1, color);
	}

	public Dice() {
		this(1, "白");
	}

	public void play() {
		val = (int) (Math.random() * 6) + 1;
	}

	public void disp() {
		System.out.println(face());
	}
}
