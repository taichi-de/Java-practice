package pr1_blatt2;

public class XmasTreePrinter {
  public static void main(String[] args) {
    // h: Höhe, i: Zeile, j: *, space: Lücke, g: Lücke(für #)
    int h = 10, j = 0;

    for (int i = 1; i <= h; ++i, j = 0) {
      for (int space = 1; space <= h - i; ++space) {
        System.out.print(" ");
      }
      while (j != 2 * i - 1) {
        System.out.print("*");
        ++j;
      }
      System.out.println();
    }
    for (int g = 1; g <= h - 1; ++g) {
      System.out.print(" ");
    }
    System.out.println("#");
  }
}
