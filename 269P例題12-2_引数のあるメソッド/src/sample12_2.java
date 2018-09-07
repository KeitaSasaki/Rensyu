public class sample12_2 {

	public static void main(String[] args) {
		System.out.println("*** BMIを計算 ***");
		dispBmin(1.75, 70.0);
		System.out.println("*** End ***");
	}
	public static void dispBmin(double height, double weight) {
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMIは"+bmi+"でaす");
		return;
	}
}