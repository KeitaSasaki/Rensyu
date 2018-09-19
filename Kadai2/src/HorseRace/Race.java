package HorseRace;

public class Race {
	public static void main(String args[]) {
		Gate gate = new Gate(); //Gateクラスのインスタンス
		gate.GateIn(); //gateに馬を入れる

		Horse[] goal;

		String gColor;
		String gNumber;
		int rank = 1;
		for (int HorseNum = 0; HorseNum < 5; HorseNum++) {

			Horse horse = gate.goal(); //馬がゴールした
			gColor = horse.getColor();
			gNumber = horse.getNumber();

			System.out.println(rank + "着は" + gNumber + "番" + ":" + gColor + "の馬");
			rank++;
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
