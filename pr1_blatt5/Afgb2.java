package pr1_blatt5;

public class Afgb2 {
  public static int PotenzIterativ(int num, int power) {
    int result = 1;
    for(int i=1; i<=power; i++)
      result *= num;
    return result;
  }
  public static int PotenzRekursiv(int num, int power) {
    if (power == 0)
      return 1;
    else
      return num  * PotenzRekursiv(num, power-1);
  }
  public static void main(String[] args) {
    System.out.println("PotenzIterativ: " + PotenzIterativ(2,5));
    System.out.println("PotenzRekursiv: " + PotenzRekursiv(2,5));
    System.out.println("Math.pow: " + (int)Math.pow(2,5));
  }
}
