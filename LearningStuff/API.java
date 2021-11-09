package LearningStuff;
import java.util.*;

public class API {
  public static void main(String[] args) {
    //Array
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

    //Set
    Set<String> colors = new HashSet<String>();
    colors.add("red");
    colors.add("yellow");
    colors.add("blue");
    colors.add("blue"); // colors.size() => 3

    //Map
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("Kyoto", 255);
    prefs.put("Tokyo", 1250);
    prefs.put("Kumamoto", 180);
    int tokyo = prefs.get("Tokyo");
    System.out.println("Tokyo's population is " + tokyo);
    prefs.remove("Kumamoto");

    for(String key: prefs.keySet()){
      // 順序バラバラ
      int value = prefs.get(key);
      System.out.println(key + "'s population is " + value);
    }
  }
}
