package pr1_blatt2;

public class FactorialCalculator{
  public static long factorialUsingForLoop(int n) {
    long fact = 1;
    for (int i = 2; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
    // --recursion--
    // if (n <= 2) {
    //   return n;
    // }
    // return n * factorialUsingRecursion(n - 1);
  }
  public static void main(String[] args) {
    System.out.println(factorialUsingForLoop(10));
  }
}
