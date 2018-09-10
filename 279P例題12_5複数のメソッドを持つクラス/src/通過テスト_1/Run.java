package 通過テスト_1;

import lib.Input;

public class Run {

	public static void main(String[] args) {
		startTitle();
		double mile = Input.getInt("mile");
		double km = mileToKm(mile);
		answer(mile, km);
		endTitle();
	}

	public static double mileToKm(double mile) {
		double tokm = 1.609344;//1マイル
		double km = mile * tokm;
		return km;
	}

	private static void startTitle() {
		System.out.println("Start");
	}

	private static void endTitle() {
		System.out.println("End");
	}

	public static void answer(double mile, double km) {
		System.out.println(mile + "マイル＝" + km + "キロ");
	}

}
