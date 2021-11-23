package pr1_blatt5;

import java.util.Scanner;

public class Afgb1 {
  public static boolean isPalindrome(char[] original, char[] reverse){
    boolean palindrome = false;
    for(int i = 0; i < original.length; i++){
      if(original.charAt(i) == reverse.charAt(i)){
        palindrome = true;
      }
    }
    // text = text.toLowerCase();
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
  }
  public static String Reverse(String original) {
    char[] reverse = new char[original.length()];

    for(int k = original.length(); k > 0; k--){
      reverse += original.charAt(k);
    }
    return reverse;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int scanlen = scan.next().length();
    char[] original = new char[scanlen];

    System.out.println(isPalindrome(original));
  }
}
