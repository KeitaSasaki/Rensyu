package HorseRace;

public class Horse {
	String color;
	int number;

	public Horse(String color, int number) {
		this.color = color;
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public String getNumber() {
		return Integer.toString(number);
	}
}
