package pr1_blatt6;

public class Afgb4 {
  public static void main (String[] args) {
		Lottofee2 fee2 = new Lottofee2();

		int zahl1 = fee2.nextNumber();
		int zahl2 = fee2.nextNumber();
		int zahl3 = fee2.nextNumber();
		int zahl4 = fee2.nextNumber();
		int zahl5 = fee2.nextNumber();
		int zahl6 = fee2.nextNumber();
		int superzahl = fee2.nextNumber();

		System.out.println(zahl1 + ", " + zahl2 + ", " + zahl3 + ", " + zahl4 + ", " + zahl5 + ", " + zahl6 + " Superzahl: " + superzahl);
	}
}
