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
		byte[] arr = new byte[49];
		for (int i = 0; i < 49; i++){
			arr[i] = (byte) (i+1);
		}
		int l = arr.length;

		zahl1 = (byte) (random.nextInt(49)+1); //Wegzug der Duplikate
		for (int a = 0; a < l; a++) {//zB: zahl1=5
			if (zahl1 == arr[a]) {
				arr[a] = arr[l-1];//arr[1,2,3,4,6,7,,,49,5]
				l--;//arr[1,2,3,4,6,7,,,,49]
			}
		}

		zahl2 = arr[random.nextInt(48)+1];
		for (int b = 0; b < l; b++) {
			if (zahl2 == arr[b]) {
				arr[b] = arr[l-1];
				l--;
			}
		}

		zahl3 = arr[random.nextInt(47)+1];
		for (int c = 0; c < l; c++) {
			if (zahl3 == arr[c]) {
				arr[c] = arr[l-1];
				l--;
			}
		}

		zahl4 = arr[random.nextInt(46)+1];
		for (int d = 0; d < l; d++) {
			if (zahl4 == arr[d]) {
				arr[d] = arr[l-1];
			}
		}

		zahl5 = arr[random.nextInt(45)+1];
		for (int e = 0; e < l; e++) {
			if (zahl5 == arr[e]) {
				arr[e] = arr[l-1];
				l--;
			}
		}

		zahl6 = arr[random.nextInt(44)+1];
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
		}

		return 1;
	}
}
