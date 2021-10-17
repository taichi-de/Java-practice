import java.util.Arrays;
import java.util.function.*;

class Solution {
  public static int maxAscilString(String[] stringList){
    Function<String, Integer> strength = str -> str.toLowerCase().chars().sum();
    Function<int[], Integer> maxIndex = list -> {
      int maxValue = Integer.MIN_VALUE;
      int maxValueIndex = 0;
      for(int i = 0; i < list.length; i++){
        if(list[i]>maxValue){
          maxValue = list[i];
          maxValueIndex = i;
        }
      }
      return maxValueIndex;
    };
    int[] stringStrengthList = Arrays.stream(stringList).mapToInt(x->strength.apply(x)).toArray();
    return maxIndex.apply(stringStrengthList);
  }
}
