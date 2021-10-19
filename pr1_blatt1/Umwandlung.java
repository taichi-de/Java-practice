package pr1_blatt1;

public class Umwandlung {
  public static void main(String[] args) {
    int num1 = 80;
    int num2 = Integer.parseInt("1110010",2);
    int num3 = 111;
    int num4 = Integer.parseInt("67",16);//67(Hex)=103
    int num5 = Integer.parseInt("61",8);//61(Oct)=49

    char a  = (char)num1;
    char b  = (char)num2;
    char c  = (char)num3;
    char d  = (char)num4;
    char e  = (char)num5;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}
