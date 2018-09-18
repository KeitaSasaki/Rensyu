package HorseRace;

public class Race {
	public static void main(String args[]) {
		Gate gate = new Gate(); //Gateクラスのインスタンス
		gate.GateIn(); //gateに馬を入れる
		Horse horse = gate.Run(); //馬が走る
		String gColor;
		String gNumber;
		for (int HorseNum = 0; HorseNum < 5; HorseNum++) {
			//このままだと全部horseになるから次は名前を変えるところから
			gColor = horse.getColor();
			gNumber = horse.getNumber();
			System.out.println(gColor);
			System.out.println(gNumber);
		}

		/*	色々確認した残骸
		    Horse horse = new Horse("黒", 1);
			System.out.println(horse);
			Horse horse2 = new Horse("栗毛", 2);
			System.out.println(horse2);
			System.out.println(horse);
		*/
	}
}
