package pr1_blatt3;

public class Afgb4 {
  public static void main(String[] args) {
    int[] arr = new int[]{0, 1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 6, 5, 5, 5, 4, 3, 2, 1, 0};
    int top = 0;

    for(int h = 0; h < arr.length; h++){
      if(top < arr[h]){
        top = arr[h];
      }
    }

    char mountain[][] = new char[arr.length][top+1]; // 0〜top

    for(int i = 0; i < mountain.length; i++){
      for(int j = 0; j < mountain[0].length; j++){
        mountain[i][j]=' ';
      }
    }

    for(int k = 0; k < arr.length; k++){
      char symbol =  '-';
      if(k != arr.length-1){
        if(arr[k]==top)
          symbol = '^';
        else if(arr[k]<arr[k+1])
          symbol =  '/';
        else if(arr[k]==arr[k+1] || arr[k]==arr[arr.length-1])
          symbol = '-';
        else if(arr[k]>arr[k+1])
          symbol = '\\';
      }
      mountain[k][arr[k]] = symbol;
    }

    for(int j = mountain[0].length-1; j >= 0; j--){
      for(int i = 0; i < mountain.length; i++){
        System.out.print(mountain[i][j]);
      }
      System.out.println();
    }
  }
}
