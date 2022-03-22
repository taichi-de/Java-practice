package viergewinnt;

import java.util.Scanner;

public class Eingabe {
	private Scanner data;

	public Eingabe() {
		data = new Scanner(System.in);
	}

	public int setReihen() {
		int i = 0;
		i = data.nextInt();
		return i;
	}

	public int setSpalten() {
		int j = 0;
		j = data.nextInt();
		return j;
	}

	public int getEingabe() {//StartPosition
		int input;
		input = data.nextInt();
		return input;
	}
}
