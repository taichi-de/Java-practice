package pr1_blatt6;

public class Afgb3 {
  public static void main(String[] args) {
		Lottofee1 fee = new Lottofee1();

		int zahl1 = fee.nextNumber();
		int zahl2 = fee.nextNumber();
		int zahl3 = fee.nextNumber();
		int zahl4 = fee.nextNumber();
		int zahl5 = fee.nextNumber();
		int zahl6 = fee.nextNumber();
		int superzahl = fee.nextNumber();

		System.out.println(zahl1 + ", " + zahl2 + ", " + zahl3 + ", " + zahl4 + ", " + zahl5 + ", " + zahl6	+ " Superzahl: " + superzahl);

	}
}
