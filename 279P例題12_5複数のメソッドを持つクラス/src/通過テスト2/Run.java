package 通過テスト2;

import lib.Input;

public class Run {

	public static void main(String[] args) {
		Start();
		End();
		String s = Input.getStr("テストする文字列");
		boolean answer = isEmpty(s);
		Decision(answer);
	}

	public static void Start() {
		System.out.println("Start");
	}

	public static void End() {
		System.out.println("End");
	}

	public static boolean isEmpty(String s) {
		if (s == null || s.isEmpty()) {
			return false;
		}
		return true;
	}

	public static void Decision(boolean answer) {
		System.out.println(answer);
	}
}
