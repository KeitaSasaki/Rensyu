package 練習12_5;

import lib.Input;

public class Run {

	public static void main(String[] args) {
		// ここにコードを挿入
		dispTitle();
		int kosu = Input.getInt("個数");
		int tanka = Input.getInt("単価");
		int sougaku = toSougaku(kosu, tanka);
		double ritu = toRitu(kosu);
		print(sougaku, ritu);
	}

	//Start
	public static void dispTitle() {
		System.out.println("■■ 値引き率 を求める ■■");
	}

	//総額を求める
	public static int toSougaku(int kosu, int tanka) {
		int sougaku = kosu * tanka;
		return sougaku;
	}

	//値引き率を求める
	public static double toRitu(int kosu) {
		double ritu;
		if (kosu >= 500) {
			ritu = 0.1;
		} else if (kosu >= 100 && kosu < 500) {
			ritu = 0.05;
		} else {
			ritu = 0;
		}
		return ritu;
	}

	public static void print(int sougaku, double ritu) {
		System.out.println("販売額=" + sougaku);
		System.out.println("値引き=" + (int) (sougaku * ritu));
		System.out.println("売上=" + (sougaku - (int) (sougaku * ritu)) + "円");
	}

}
