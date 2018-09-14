package Tramp;

public class Run {

	public static void main(String args[]) {
		Deck deck1 = new Deck(); //デッキのインスタンス作成
		deck1.make();
		deck1.draw();
		deck1.go();
	}
}
