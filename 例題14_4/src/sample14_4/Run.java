package sample14_4;

public class Run {

	public static void main(String[] args) {
		Dice dice = new Dice(2, "黒");
		Dice dice2 = new Dice("青");
		Dice dice3 = new Dice();
		dice.disp();
		dice2.disp();
		dice3.disp();
		System.out.println("----------ランダム処理----------");
		dice.play();
		dice2.play();
		dice3.play();
		dice.disp();
		dice2.disp();
		dice3.disp();

	}

}
