public class array {
  public static void main(String[] args) {
    // int[] scores = new int[5];
    int [] scores = {20, 30, 40, 50, 80};
    int sum = 0;
    // int count = 0;
    // for(int i = 0; i < scores.length; i++){
    for(int value : scores){
      // sum += scores[value];
      System.out.print(value + " ");
      // if(scores[i] >= 50){
      //   count++;
      // }
    }
    int avg = sum / scores.length;
    System.out.println("sum is " + sum);
    System.out.println("avg is " + avg);
    // System.out.println("more than 50 is " + count);
  }
}
