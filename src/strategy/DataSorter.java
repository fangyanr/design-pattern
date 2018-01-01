package strategy;
import java.lang.Comparable;
public class DataSorter {
	public static void sort(Object[] arr) {
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < arr.length - 1; j++) {
				Comparable o1 = (Comparable) arr[j];
				Comparable o2 = (Comparable) arr[j + 1];
				if (o1.compareTo(o2) == 1) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	private static void swap(Object[] arr, int x, int y) {
		Object temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void print(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
