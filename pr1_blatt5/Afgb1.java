package pr1_blatt5;

import java.util.Scanner;

public class Afgb1 {
  public static boolean isPalindrome(char[] originalArr, char[] reverseArr, int len){
    boolean palindrome = false;
    for(int i = 0, j = len-1; i < j; i++, j--){
      if(originalArr[i] == reverseArr[len-1-j]){
        palindrome = true;
      }
    }
    return palindrome;
  }
  public static char[] Reverse(char[] originalArr, char[] reverseArr, int len) {
    for (int f = 0; f < len; f++){
      reverseArr[len-1-f] = originalArr[f];
    }
    return reverseArr;
  }

  public static boolean isPalindromeRecursive(char[] originalArr, int forward, int backward){
    if (forward == backward) {
      return true;
    }else if ((originalArr[forward]) != (originalArr[backward])) {
      return false;
    }else if (forward < backward) {
      return isPalindromeRecursive(originalArr, forward+1, backward-1);
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String original = scan.next().toLowerCase();
    char[] originalArr = original.toCharArray();
    char[] reverseArr = new char[originalArr.length];
    int len = originalArr.length;

    /* Iterative */
    System.out.print(original + " -> ");
    System.out.println(Reverse(originalArr, reverseArr, len));
    if(isPalindrome(originalArr, reverseArr, len))
      System.out.println(original + " ist Palindrom!");
    else
      System.out.println(original + " ist nicht Palindrom..");

    /* Recursive */
    // if(isPalindromeRecursive(originalArr, 0, originalArr.length-1))
    //   System.out.println(original + " ist Palindrom!");
    // else
    //   System.out.println(original + " ist nicht Palindrom..");

    scan.close();
  }
}
