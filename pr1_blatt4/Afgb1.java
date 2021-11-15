package pr1_blatt4;

public class Afgb1 {
  public static int factorialUsingRecursion(int n) {
    int fact = 1;
    if(n>20) fact = Integer.MIN_VALUE;
    else {
      for(int i = 2; i <= n; i++){
        fact *= i;
      }
    }
    return fact;
  }
  public static void main(String[] args) {
    System.out.println(factorialUsingRecursion(255)); // n<=20 ok
  }
}
