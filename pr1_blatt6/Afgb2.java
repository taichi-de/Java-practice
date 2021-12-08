package pr1_blatt6;

public class Afgb2 {
  public static int binaryIter(int[] arr, int num) {
    // {2,5,8,12,(16),23,38,56,72,91} :23
    // {23,38,(56),72,91}
    // {23,38}
		int first = 0;
		int last = arr.length-1;

		while (last >= first) {
			int arrLen = last-first;
			int middle = first+(arrLen/2);

			if (num == arr[middle]) {
				return middle;
			}else if (num < arr[middle]) {
				last = middle;
			}else if (num > arr[middle]) {
				first = middle+1;
			}
		}
		return -1;
	}

	public static int binaryRek(int[] arr, int first, int last, int num) {
		while (last >= first) {
			int arrLen = last - first;
			int middle = first + (arrLen / 2);

			if (num == arr[middle]) {
				return middle;
			}else if (num < arr[middle]) {
				return binaryRek(arr, first, middle - 1, num);
			}else if (num > arr[middle]) {
				return binaryRek(arr, middle + 1, last, num);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2,5,8,12,16,23,38,56,72,91};
		int first = 0;
		int last = arr.length-1;
    System.out.println(binaryIter(arr, 23));
		System.out.println(binaryRek(arr, first, last, 23));
	}
}
