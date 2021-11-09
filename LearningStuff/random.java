package LearningStuff;
public class random {
  public static void main(String[] args){
    int r = new java.util.Random().nextInt(90);
    System.out.println("u must be " + r + "y/o, right?");

    String name = new java.util.Scanner(System.in).nextLine();
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println(name + "are " + age + "y/o.");

    //equal
    //if(str.equals("###")||month == 5){}
  }
}
