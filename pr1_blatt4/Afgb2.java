package pr1_blatt4;

import java.util.Random;
import java.util.Arrays;

public class Afgb2 {
	public static Random random = new Random();

	public static int getSingleDiceRoll() {
		return random.nextInt(6)+1;
	}

	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++)
      System.out.print(i == (arr.length - 1) ? arr[i] : arr[i]+"-");
    System.out.println();
	}

	public static int[] getAllDiceValues() {
    int[] diceRolls = new int[5];
    for(int k = 0; k < diceRolls.length; k++){
      diceRolls[k] = getSingleDiceRoll();
    }
    Arrays.sort(diceRolls);
    return diceRolls;
  }

	public static boolean isSmallStraight(int[] diceRolls) {
    //diceRolls = removeDuplicates(diceRolls);
    if(diceRolls[0] == 1 && diceRolls[1] == 2 && diceRolls[2] == 3 && diceRolls[3] == 4)
      return true;
    else if(diceRolls[1] == 2 && diceRolls[2] == 3 && diceRolls[3] == 4 && diceRolls[4] == 5)
      return true;
    else if(diceRolls[2] == 3 && diceRolls[3] == 4 && diceRolls[4] == 5 && diceRolls[5] == 6)
      return true;
    return false;
  }

	public static void main(String[] args) {
    int[] dices;
    int runde = 1;
    boolean straight = false;
    while(!straight){
      System.out.print(String.format("Runde %s: ",runde));
      dices = getAllDiceValues();
      printArray(dices);
      runde++;

      if(isSmallStraight(dices)){
        System.out.println("Gewonnen!");
        straight = true;
      }
    }System.out.println(String.format("Das war die %s-te Runde!",runde-1));
	}
}
