public class DutchNationalFlag {

	public static void sort(int[] array) {
		int low = 0;
		int high = array.length - 1;
		int mid = 0;

		while (mid <= high) {
			switch (array[mid]) {
			case 0:
				DutchNationalFlag.swap(array, low++, mid++);
				break;
			case 1:
				mid++;
				break;
			case 2:
				DutchNationalFlag.swap(array, mid, high--);
				break;
			}
		}
	}

	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		DutchNationalFlag.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
