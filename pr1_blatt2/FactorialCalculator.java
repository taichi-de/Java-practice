package pr1_blatt2;

public class FactorialCalculator{
  public static int factorialUsingForLoop(int n) {
    int fact = 1; //long?
    if (n <= 2) {
      return n;
    }else{
      // --ForLoop--
      for (int i = 2; i <= n; i++) {
        fact = fact * i;
      }
    }
    return fact;
    // --recursion--
    // return n * factorialUsingRecursion(n - 1);
  }
  public static void main(String[] args) {
    System.out.println(factorialUsingForLoop(5));
  }
}
