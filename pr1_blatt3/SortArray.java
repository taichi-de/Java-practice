package pr1_blatt3;

import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] arr = {3,1,6,5,2,8,4};
    int[] newArr = null;

    for (int i = arr.length-1; i < 0; i--) {
      if(arr[i] == arr.length-1){
        newArr = new int[arr.length - 1];
        for(int index = 0; index < i; index++){
          newArr[index] = arr[index];
        }
        for(int j = i; j < arr.length - 1; j++){
          newArr[j] = arr[j+1];
        }
        break;
      }
    }
    System.out.println("{" + Arrays.toString(arr) + "}" + "->" + "{" + Arrays.toString(newArr) + "}");
  }
}
