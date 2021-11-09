package pr1_blatt3;

public class Afgb1 {
  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + ", ");
  }
  public static void main(String[] args){
    int[] src = {12, 24, 18, 31, 17};

    printArray(src);
    System.out.println();

    for (int f = 0, l = src.length - 1; f < l; f++, l--){
      int temp = src[f];
      src[f]  = src[l];
      src[l] = temp;
    }

    printArray(src);
  }
}
