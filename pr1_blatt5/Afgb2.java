package pr1_blatt5;

public class Afgb2 {
  public static int PotenzIterativ(int n) {
    int a = 2;
    int result = 1;
    for(int i=1; i<=n; i++)
      result *= a;
    return result;
  }
  public static int PotenzRekursiv(int n) {
    int a = 2;
    int result = 1;
    if (n > 1){
      result = a * PotenzIterativ(n-1);
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println("PotenzIterativ: " + PotenzIterativ(5));
    System.out.println("PotenzRekursiv: " + PotenzRekursiv(5));
    System.out.println("Math.pow: " + (int)Math.pow(2,5));
  }
}
