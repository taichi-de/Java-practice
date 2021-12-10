package pr1_blatt6;

import java.util.Random;

public class Lottofee2 {
  public static Random random = new Random();

	private byte zahl1;
	private byte zahl2;
	private byte zahl3;
	private byte zahl4;
	private byte zahl5;
	private byte zahl6;
	private byte superZahl;
	private byte counter = 0;

	public Lottofee2() {
		byte [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
		int l = arr.length;

		zahl1 = (byte) (random.nextInt(49)); // (49) + 1 ???
		for (int a = 0; a < l; a++) {
			if (zahl1 == arr[a]) {
				arr[a] = arr[l-1];
				l--;
			}
		}

		zahl2 = arr[random.nextInt(48)];
		for (int b = 0; b < l; b++) {
			if (zahl2 == arr[b]) {
				arr[b] = arr[l-1];
				l--;
			}
		}

		zahl3 = arr[random.nextInt(47)];
		for (int c = 0; c < l; c++) {
			if (zahl3 == arr[c]) {
				arr[c] = arr[l-1];
				l--;
			}
		}

		zahl4 = arr[random.nextInt(46)];
		for (int d = 0; d < l; d++) {
			if (zahl4 == arr[d]) {
				arr[d] = arr[l-1];
			}
		}

		zahl5 = arr[random.nextInt(45)];
		for (int e = 0; e < l; e++) {
			if (zahl5 == arr[e]) {
				arr[e] = arr[l-1];
				l--;
			}
		}

		zahl6 = arr[random.nextInt(44)];
		for (int f = 0; f < l; f++) {
			if (zahl6 == arr[f]) {
				arr[f] = arr[l-1];
				l--;
			}
		}

		superZahl = (byte) (random.nextInt(8)+1);
	}

	public byte nextNumber() {
		counter++;

		if (counter == 1) {
			return zahl1;
		}else if (counter == 2) {
			return zahl2;
		}else if (counter == 3) {
			return zahl3;
		}else if (counter == 4) {
			return zahl4;
		}else if (counter == 5) {
			return zahl5;
		}else if (counter == 6) {
			return zahl6;
		}else if (counter == 7) {
			return superZahl;
		// }else if (counter > 7) { // 必要？
		// 	return -1;
		}

		return 1;
	}
}
