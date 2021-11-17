package pr1_blatt4;

public class test3 {

	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static char[] encode(char[] array, int verschiebung) {
		for (int i = 0; i < array.length; i++) {
			int offset = (char) (array[i] + verschiebung);
			if (array[i] >= 'a' && array[i] <= 'z') {
				if (offset > 'z') {
					array[i] = (char) (offset - 26);
				}
				if ((char) (offset) < 'z') {
					array[i] = (char) (offset);
				}
				if (offset == 'z') {
					array[i] = (char) (offset);
				}
			} else if (array[i] >= 'A' && array[i] <= 'Z') {
				if (offset > 'Z') {
					array[i] = (char) (offset - 26);
				}
				if (offset < 'Z') {
					array[i] = (char) (offset);
				}
				if (array[i] == 'Z') {
					array[i] = (char) (offset);
				}
			} else
				array[i] = ' ';
		}
		return array;
	}

	public static char [] decode(char [] array, int verschiebung) {
		for (int i = 0; i < array.length; i++) {
			int offset = (char) (array[i] - verschiebung);
			if (array[i] >= 'a' && array[i] <= 'z') {
				if (offset > 'a') {
					array[i] = (char) (offset);
				}
				if ((char) (offset) < 'a') {
					array[i] = (char) (offset + 26);
				}
				if (offset == 'a') {
					array[i] = (char) (offset);
				}
			} else if (array[i] >= 'A' && array[i] <= 'Z') {
				if (offset > 'A') {
					array[i] = (char) (offset);
				}
				if (offset < 'A') {
					array[i] = (char) (offset + 26);
				}
				if (array[i] == 'A') {
					array[i] = (char) (offset);
				}
			} else
			array[i] = ' ';
		}
		return array;
	}

	public static void main(String[] args) {
		char[] i2 = "abcd".toCharArray();
		char[] input = "Uheen qre Pbqr shaxgvbavreg".toCharArray();

		System.out.print("Code: " );
		printArray(input);

		System.out.print("Entschl�sseln: ");
		printArray(decode(input, 13));

		System.out.print("Verschl�sseln: ");
		printArray(encode(i2, 13));
	}
}





