package pr1_blatt1;

import java.util.Scanner;

public class VATCalculator {
  private static int getPrice(){
    System.out.println("Bitte Bruttobetrag in ganzen Euro eingeben: ");
    return (new Scanner(System.in)).nextInt();
  }

  public static void main(String[] args) {
    int euro = getPrice();
    System.out.println("Dein Nettobetrag ist: " + euro * 1.16 + " €");
    System.out.println("Dein Nettobetrag ist: " + euro * 1.19 + " €");

  }
}
