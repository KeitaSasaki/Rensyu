package 練習12_1_T;

public class Run {

	public static void main(String[] args) {
		System.out.println("Start");
		//メソッド呼び出す
		rand();
		System.out.println("End");
	}

	//ランダムの数字生成(1~10)とインスタンス生成
	private static void rand() {
		int random;
		random = (int)(Math.random()*10);
		Box box = new Box(random);
		System.out.println(box.number);
	}
}
