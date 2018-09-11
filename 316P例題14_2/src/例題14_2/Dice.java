package 例題14_2;

public class Dice {
	int val;

	public Dice(int val) {
		this.val = val;
	}

	public void disp() {
		System.out.println(val);
	}

	public void play() {
		val = (int) (Math.random() * 6) + 1;
	}
}
