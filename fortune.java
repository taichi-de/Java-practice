public class fortune {
  public static void main(String[] args){
    int fortune = new java.util.Random().nextInt(5) + 1;
    switch (fortune) {
      case 1:
      case 2:
        System.out.println("good!");
      case 3:
        System.out.println("normal");
      case 4:
      case 5:
        System.out.println("bad");
    }
  }
}
