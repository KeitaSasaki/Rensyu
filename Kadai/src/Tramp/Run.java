package Tramp;

public class Run {

	public static void main(String args[]) {
		Deck deck1 = new Deck(); //デッキのインスタンス作成
		deck1.make();
		Card card = deck1.draw();

		System.out.println("Start");
		String numStr = card.getNumber();
		String suitStr = card.getSuit();
		System.out.println(suitStr);
		System.out.println(numStr);
		System.out.println("End");
	}
}
