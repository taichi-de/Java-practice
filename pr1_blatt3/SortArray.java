package pr1_blatt3;

import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] arr = {3,1,6,5,2,8,4};
    int[] newArr = null;
    // int elementToBeDeleted = 3;
    System.out.println("Original Array is: "+ Arrays.toString(arr));

    for (int i = arr.length-1; i < 0; i--) {
      if(arr[i] == elementToBeDeleted){
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
    System.out.println("New Array after deleting element = " + Arrays.toString(newArr));
  }
}
