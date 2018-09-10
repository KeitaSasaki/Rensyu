package 練習12_3;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("単価を入力してください");
		int tanka = scancost();
		System.out.println("税率を入力してください");
		double ritu = scantax();
		int taxIncluded = tax(tanka, ritu);
		System.out.println("税額="+taxIncluded);
		System.out.println("End");

		//System.out.println(scancost() * scancost());
	}
	public static int tax(int tanka,double ritu) {
		int price;
		price = tanka + (int)(tanka*ritu);
		return price;
	}
	public static int scancost() {
		Scanner scanner = new Scanner(System.in);
		int val;
		val =scanner.nextInt();
		return val;
	}
	public static double scantax() {
		Scanner scanner1 = new Scanner(System.in);
		double zei;
		zei = scanner1.nextDouble();
		return zei;
	}
}
