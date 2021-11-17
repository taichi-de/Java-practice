package pr1_blatt5;

public class Afgb1 {
  public static boolean isPalindrom(String text){
    text = text.toLowerCase();
    char[] charArr = new char[text.length()];

    for (int f = 0, l = charArr.length - 1; f < l; f++, l--){
      char temp = charArr[f]; //int?
      charArr[f]  = charArr[l];
      charArr[l] = temp;
    }
    return true;
  }
  public static void main(String[] args) {
    String text = new java.util.Scanner(System.in).nextLine();
    System.out.println(isPalindrom(text));
  }
}
