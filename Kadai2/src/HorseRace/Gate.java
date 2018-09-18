package HorseRace;

import java.util.ArrayList;

public class Gate {
	String[] color = { "黒毛", "栗毛", "青栗毛", "芦毛", "白毛" };
	int[] number = { 1, 2, 3, 4, 5, };
	ArrayList<Horse> gate;

	public void GateIn() {

		gate = new ArrayList<Horse>();
		int count = 1;
		for (int index = 0; index < color.length; index++) {
			gate.add(new Horse(color[index], number[index]));
			System.out.println("作ったよ" + count);
			count++;

		}
	}

	public Horse Run() {
		Horse horse = gate.get(0);
		gate.remove(0);
		return horse;

	}
}
