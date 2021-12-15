package pr1_blatt6;

import java.util.Scanner;

public class Afgb1 {
	public static long isFactorialIter(long fact) {
		int i = 1;
		for (int j = 1; fact % j == 0; j++) {
			fact /= j;
			if (fact == 1) return j;
		}
		if (fact > 1) return -1;
		return i;
	}
  // 720/1=720
  // 720/2=360
  // 360/3=120
  // 120/4=30
  // 30/5=6
  // 6/6=1(6%6=0) -> j=6 ... finish

  // 4/1=4
  // 4/2=2
  // 2/3=0.666 -> j=-1

	public static long isFactorialRek(long fact, int k) {
		if (fact == 1)  return k-1;
		if (fact % k != 0) return -1;
		fact /= k;
		k++;
		return isFactorialRek(fact, k);
	}

	public static void main(String[] args) {
		System.out.print("isFactorial: ");
		Scanner s = new Scanner(System.in);
		long input = s.nextLong();
		s.close();

		// System.out.println(isFactorialIter(input));
		System.out.println(isFactorialRek(input, 1));
	}
}
