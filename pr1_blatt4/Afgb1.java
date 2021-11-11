package pr1_blatt4;

public class Afgb1 {
  public static int factorialUsingRecursion(int n) {
    if (n == 0) {
      return 1;
    }else if(n==1 || n==2){
      return n;
    }else{
      return n * factorialUsingRecursion(n-1);
    }
  }
  // Falls während der Berechnung des Ergebnisses ein Überlauf auftritt, soll die Methode den kleinsten Wert zurückgeben, den der von Ihnen gewählte Datentyp unterstützt. -> ??
  public static void main(String[] args) {
    System.out.println(factorialUsingRecursion(20));
  }
}
