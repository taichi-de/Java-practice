package pr1_blatt1;

import java.util.*;

public class VATCalculator {
  private static double getPrice(){
    System.out.println("Bitte Bruttobetrag in ganzen Euro eingeben: ");
    return (new Scanner(System.in)).nextDouble();
  }

  public static void main(String[] args) {
    double euro = getPrice();
    System.out.println("Dein Nettobetrag ist: " + (double)(euro * (100.0-16.0)/100.0) + " €");
    // System.out.println("Dein Nettobetrag ist: " + euro * (100-19)/100 + " €");
  }
}
