public class sample12_4 {
	public static void main(String[] args) {
		System.out.println(sankaku(1));
		System.out.println(sankaku(1,2));
		System.out.println(sankaku(3, 4, 5));
	}
	public static double sankaku(double a) {
		return Math.sqrt(3) * Math.pow(a, 2) / 4; //Math.sqrtは平方根
	}
	public static double sankaku(double a,double b ) {
		return a*b / 2;
	}
	public static double sankaku(double a,double b, double c) {
		double s = (a+b+c) / 2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
