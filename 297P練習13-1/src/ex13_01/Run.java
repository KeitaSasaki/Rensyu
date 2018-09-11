package ex13_01;

public class Run {

	public static void main(String[] args) {
		Card card = new Card();
		card.num = 1;
		card.suit = "スペード";
		//初期状態のcard
		System.out.println("トランプの数字＝" + card.num);
		System.out.println("トランプの数字＝" + card.suit);
		card.play();
		//シャッフル後のcard
		System.out.println("トランプの数字＝" + card.num);
		System.out.println("トランプの数字＝" + card.suit);
	}

}
