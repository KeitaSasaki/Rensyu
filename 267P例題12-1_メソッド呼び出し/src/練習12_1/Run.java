package 練習12_1;

public class Run {
		public static void main(String[] args) {
			System.out.println("Start");
		dispRandom();
		System.out.println("End");
	}
	public static void dispRandom() {
		double num ;
		num = Math.random()*100;
		System.out.println(num);
	}

}
