package pr1_blatt3;

public class Afgb2 {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    for (int i : arr)
      sum += i;
    System.out.println("sum is " + sum);
  }
}
