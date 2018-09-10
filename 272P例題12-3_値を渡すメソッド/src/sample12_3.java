public class sample12_3 {
	public static void main(String[] args) {
		//出力処理
		System.out.println("*** BMiを計算 ***");
		double val = getbmi (1.75,70.0); //bmiの値を受け取る
		System.out.println("BMIは"+val+"です");
		System.out.println("*** End ***");
	}
	//計算
	public static double getbmi(double height , double weight) {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}
}
