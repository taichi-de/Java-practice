package pr1_blatt2;

public class Checksum {
  public static void main(String[] args) throws Exception {
    int input, zahl;
    int summe = 0;
    System.out.println("Gib ein: ");
    do {
      input = System.in.read();
      if (input >=48 && input < 58) {
        zahl = Integer.parseInt(String.valueOf(Character.toChars(input))); // den integer -> in char -> in nen strintg -> nen int
        System.out.print(zahl);
        summe += zahl;
      }
    }
    while (input >=48 && input < 58);
    System.out.println("\nDie Quersumme ist: " + summe);
  }
}
