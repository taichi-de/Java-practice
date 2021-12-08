package pr1_blatt6;

import java.util.Random;
import java.util.Arrays;

public class Afgb3 {
  public  Random random = new Random();

	public  byte nextNumber() {
		return (byte) (random.nextInt(48)+1);
	}

  public  void printArray(byte[] lotto) {
		for(int i = 0; i < lotto.length; i++)
      System.out.print(lotto[i]+", ");
	}

  private  byte[] getAllNumber() {
    byte[] lottoNum = new byte[6];
    for(int k = 0; k < lottoNum.length; k++){
      lottoNum[k] = nextNumber();
    }
    Arrays.sort(lottoNum);
    return lottoNum;
  }

  public  boolean isLottoNumber(byte[] lotto) {
    //lottoNum = removeDuplicates(lottoNum);
    if(lotto[0] == lotto[1] || lotto[1] == lotto[2] || lotto[2] == lotto[3] || lotto[4] == lotto[5] || lotto[4] == lotto[5])
      return false;
    return true;
  }

  public  void main(String[] args) {
    byte[] lotto;
    lotto = getAllNumber();

    if(isLottoNumber(lotto)){
      System.out.print("Lottofee: [");
      printArray(lotto);
      System.out.println("(SZ)" + (byte) (random.nextInt(8)+1) + "]");
    }
    else System.out.println("noch mal");
  }
}
