package 通過テスト;

public class Denpyo {
	String date; //日付
	String item; //項目
	int price; //単価
	int number; //個数

	void play1() {
		date = "1月15日";
		item = "パソコン";
		price = 50000;
		number = 1;
	}

	void play2() {
		date = "1月16日";
		item = "コピー用紙";
		price = 600;
		number = 5;
	}

	void disp() {
		System.out.println(date);
		System.out.println(item);
		System.out.println(price);
		System.out.println(number);
		System.out.println();
	}
}
