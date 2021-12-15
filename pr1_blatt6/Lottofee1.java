package pr1_blatt6;

import java.util.Random;

public class Lottofee1 {
  public static Random random = new Random();

	private byte zahl1;
	private byte zahl2;
	private byte zahl3;
	private byte zahl4;
	private byte zahl5;
	private byte zahl6;
	private byte superZahl;
	private byte counter = 0;

	public byte nextNumber() {
		counter++;

		if (counter == 1) {
			zahl1 = (byte) (random.nextInt(48) + 1);
			return zahl1;

		}else if (counter == 2) {
			do {
				zahl2 = (byte) (random.nextInt(48) + 1);
			} while (zahl2 == zahl1);
			return zahl2;

		}else if (counter == 3) {
			do {
				zahl3 = (byte) (random.nextInt(48) + 1);
			} while (zahl3 == zahl1 || zahl3 == zahl2);
			return zahl3;

		}else if (counter == 4) {
			do {
				zahl4 = (byte) (random.nextInt(48) + 1);
			} while (zahl4 == zahl1 || zahl4 == zahl2 || zahl4 == zahl3);
			return zahl4;

		}else if (counter == 5) {
			do {
				zahl5 = (byte) (random.nextInt(48) + 1);
			} while (zahl5 == zahl1 || zahl5 == zahl2 || zahl5 == zahl3 || zahl5 == zahl4);
			return zahl5;

		}else if (counter == 6) {
			do {
				zahl6 = (byte) (random.nextInt(48) + 1);
			} while (zahl6 == zahl1 || zahl6 == zahl2 || zahl6 == zahl3 || zahl6 == zahl4 || zahl6 == zahl5);
			return zahl6;

		}else if (counter == 7) {
			superZahl = (byte) (random.nextInt(8) + 1);
			return superZahl;
		}

		return 1;
	}
}
