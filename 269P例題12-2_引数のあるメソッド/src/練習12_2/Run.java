package 練習12_2;

public class Run {

	public static void main(String[] args) {
		System.out.println("Start");
		//メソッド呼び出し
		greet("田中宏",1);
		System.out.println("End");
	}

	public static void greet(String name, int number) {
		//System.out.println("性別を入力してください\r\n--------------------\r\n男性:1\r\n女性:2\r\n--------------------");
		if (number == 1) {
			System.out.println("こんにちは"+name+"くん");
		}else {
			System.out.println("こんにちは"+name+"さん");
		}
	}
}