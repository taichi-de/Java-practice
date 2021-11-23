package pr1_blatt5;

public class Afgb3 {
  public static int ggt(int x, int y) {
    if(x == 0)
      return y;
    else if(x == y)
      return x;

    System.out.println("ggt(" + x + ", " + y + ")");
    while (y != 0) {
      if(x > y)
        x = x - y;
      else
        y = y - x;
      System.out.println(x + " " + y);
    }
    return x;
  }
  public static void main(String[] args) {
    System.out.println(ggt(44,12));
  }
}
