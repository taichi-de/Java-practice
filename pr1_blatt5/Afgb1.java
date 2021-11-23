package pr1_blatt5;

public class Afgb1 {
  public static boolean isPalindrom(String text){

    text = text.toLowerCase();
    // if('a'<=letter && letter <='z'){
    //   letter += shift;
    //   while(letter > 'z'){
    //     letter -= 26;
    //   }
    // }else if('A'<=letter && letter <='Z'){
    //   letter += shift;
    //   while(letter > 'Z'){
    //     letter -= 26;
    //   }
    // }else{
    //   letter = ' ';
    // }
    // return letter;
    char[] charArr = new char[text.length()];

    for (int f = 0, l = charArr.length - 1; f < l; f++, l--){
      char temp = charArr[f];
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
