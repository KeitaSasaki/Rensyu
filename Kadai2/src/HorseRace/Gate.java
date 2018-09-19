package HorseRace;

import java.util.ArrayList;
import java.util.Collections;

public class Gate {
	String[] color = { "黒毛", "栗毛", "青栗毛", "芦毛", "白毛" };
	int[] number = { 1, 2, 3, 4, 5, };
	ArrayList<Horse> gate;

	public void GateIn() {

		gate = new ArrayList<Horse>();
		int count = 1;
		for (int index = 0; index < color.length; index++) {
			gate.add(new Horse(color[index], number[index]));
			System.out.println("馬が" + count + "頭" + "ゲートに入った");
		}
		System.out.println("馬が走っている");
		Collections.shuffle(gate);//ゲートのシャッフル
	}

	public Horse goal() {
		Horse horse = gate.get(0);
		gate.remove(0);
		return horse;

	}
}
