package pr1_blatt3;

public class Afgb3 {
  public static void main(String[] args){
    int[] arr = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
    int current = arr[0];

    // Original array:
    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + ", ");
    System.out.println();

    // Array without duplicates:
    for (int j = 0; j < arr.length; j++) {
      if (current != arr[j]) {
        System.out.print(current + ", ");
        current = arr[j];
      }
    }
    System.out.println(current);
  }
}

