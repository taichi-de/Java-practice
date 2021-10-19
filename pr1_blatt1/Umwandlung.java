package pr1_blatt1;

public class Umwandlung {
  public static void main(String[] args) {
    // System.out.println(Integer.toHexString(80));
    //radix 10 is for decimal number, for hexa use radix 16
    int radix = 10;
    int value_int = 80;
    char value_char = Character.forDigit(value_int , radix);
    System.out.println(value_char);
  }
}
