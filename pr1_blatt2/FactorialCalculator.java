package pr1_blatt2;

public class FactorialCalculator{
  // public static int factorialUsingForLoop(int n) {
  //   int fact = 1;
  //   if (n <= 2) {
  //     return n;
  //   }else{
  //     for (int i = 2; i <= n; i++) {
  //       fact = fact * i;
  //     }
  //   }
  //   return fact;
  // }
  public static int factorialUsingRecursion(int n) {
    if (n == 0) {
      return 1;
    }else if(n<0 && n <= 2){
      return n;
    }else{
      return n * factorialUsingRecursion(n - 1);
    }
  }
  public static void main(String[] args) {
    // System.out.println(factorialUsingForLoop(5));
    System.out.println(factorialUsingRecursion(5));
  }
}
