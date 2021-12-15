package pr1_blatt6;

public class Afgb4 {
  public static void main (String[] args) {
		Lottofee2 Lf2 = new Lottofee2();

		int zahl1 = Lf2.nextNumber();
		int zahl2 = Lf2.nextNumber();
		int zahl3 = Lf2.nextNumber();
		int zahl4 = Lf2.nextNumber();
		int zahl5 = Lf2.nextNumber();
		int zahl6 = Lf2.nextNumber();
		int superzahl = Lf2.nextNumber();

		System.out.println("Lf2: " + zahl1 + ", " + zahl2 + ", " + zahl3 + ", " + zahl4 + ", " + zahl5 + ", " + zahl6 + ", Superzahl: " + superzahl);
	}
}
