package pr1_blatt4;

import java.util.Random;

public class test2 {

	public static Random random = new Random();

	public static int getSingleDiceRoll() {
		return random.nextInt(6) + 1;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] getAllDiceValues() { // rollt den wuerfel 5 mal
		int[] rolled = new int[5];
		for (int i = 0; i < rolled.length; i++) {
			rolled[i] = getSingleDiceRoll();
		}
		sort(rolled);

		return rolled;
	}

	public static int[] sort(int[] array) { // sortiert die elemente nach groesse
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	public static boolean isSmallStraight(int[] diceRolls) { // ob eine strasse da ist

		int inARow = 0;
		for (int i = 0; i < diceRolls.length - 1; i++) {
			if (diceRolls[i] + 1 == diceRolls[i + 1]) {
				inARow++;
			} else if (diceRolls[i] == diceRolls[i + 1]) {
				continue;
			} else {
				inARow = 0;
			}

			if (inARow + 1 == 4) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] locarr;
		int counter = 0;
		boolean straight = false; // abbruch bedingung

		while (!straight) {
			System.out.print("Das gewoerfelt: ");
			locarr = getAllDiceValues();
			printArray(locarr);
			counter++;

			if (isSmallStraight(locarr)) {
				System.out.println("Gewonnen!!! ");
				straight = true; // abbruch bedingung
			}

		}
		System.out.println("Versuch: " + counter);
	}
}
