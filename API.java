import java.util.*;

public class API {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    // ArrayList<String> names = new ArrayList<>(); 省略可
    names.add("Tanaka");
    names.add("Sato");
    names.add("Suzuki");
    System.out.println(names.get(1));

    for(int i =0; i < names.size(); i++ ){
      System.out.println(names.get(i));
    }
    // for(String s : names){
    //   System.out.println(s));
    // }

    Iterator<String> it = names.iterator();
    while (it.hasNext()){
      String e = it.next();
      System.out.println(e);
    }
  }
}
