package pr1_blatt4;

import java.util.Random;

public class Afgb2 {
	public static Random random = new Random();

	public static int getSingleDiceRoll() {
		return random.nextInt(6) + 1;
	}

	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + "-");
    System.out.println();
	}

	public static int[] getAllDiceValues() {
    int[] diceRolls = new int[5];
    for(int k = 1; k <= diceRolls.length; k++){
      diceRolls[k] = getSingleDiceRoll();
    }
    return diceRolls;
  }

	public static boolean isSmallStraight(int[] diceRolls) {
    boolean isSmall = true;
		for(int j = 0; j < diceRolls.length; j++){
      if(diceRolls[j] == diceRolls[j + 1] && diceRolls[j+1] == diceRolls[j+2] && diceRolls[j+2] == diceRolls[j+3] && diceRolls[j+3] == diceRolls[j+4]) return true;
      return false;
    }
    return isSmall;
  }

	public static void main(String[] args) {
    // System.out.println(isSmallStraight());
    int runde = 0;
    while(isSmallStraight(null)){
      System.out.println(getAllDiceValues());
      runde++;
    }System.out.println("Das war die " + runde + "te Runde!");
    // System.out.println(String.format("%s was rolled %s times", i + 2, results[i]));
	}
}
