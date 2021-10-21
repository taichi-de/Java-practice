package pr1_blatt1;

public class Ausdruecke {
  public static void main(String[] args) {
    int i = 10;
    System.out.println(i > 100); // F
    System.out.println(i%5 == 1 || i++ == 10); //T
    System.out.println(i%5 == 1 || i == 12); // T
    System.out.println(i == 11); // T
    System.out.println(i << 1); // 22: 1011(11) -> 10110(22)
    System.out.println(i); // 11
    System.out.println(Integer.MAX_VALUE + 1 > 0 && ++i > 1); // F: F&&T=F
    System.out.println(true && ++i > 1);
    System.out.println(i); // 11
  }
}
