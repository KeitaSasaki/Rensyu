package 練習14_1;

public class Run {

	public static void main(String[] args) {
		Card card = new Card("スペード", 10);
		Card card2 = new Card("ハート", 1);
		card.face();
		card.disp();
		card2.face();
		card2.disp();
	}

}
