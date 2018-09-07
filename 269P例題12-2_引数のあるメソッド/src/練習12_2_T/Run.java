package 練習12_2_T;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		String name;
		System.out.println("Start");
		//性別の入力
		System.out.println("性別を入力してください\r\n--------------------\r\n男性:1\r\n女性:2\r\n--------------------");
		number = scanner.nextInt();
		//名前の入力
		System.out.println("次に名前を入力してください");
		name = scanner.next();
		//メソッド呼び出し
		greet(name,number);
		scanner.close();
		System.out.println("End");
	}
	public static void greet(String name, int number) {
		if (number == 1) {
			System.out.println("こんにちは"+name+"くん");
			return;
		}else {
			System.out.println("こんにちは"+name+"さん");
			return;
		}
	}
}