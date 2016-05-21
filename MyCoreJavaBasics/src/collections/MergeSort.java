package collections;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] sortArray, int[] tmpArray, int lowIndex,
			int highIndex) {
		if (highIndex > lowIndex) {
			int midIndex = (highIndex + lowIndex) / 2;
			mergeSort(sortArray, tmpArray, lowIndex, midIndex);

			mergeSort(sortArray, tmpArray, midIndex + 1, highIndex);
			merge(sortArray, tmpArray, lowIndex, midIndex, highIndex);
		}

	}

	public static void merge(int[] sortArray, int[] tmpArray, int lowIndex,
			int midIndex, int highIndex) {
		int lowIndex1 = lowIndex;
		int lowIndex2 = midIndex + 1;
		int i = lowIndex;
		System.arraycopy(sortArray, 0, tmpArray, 0, sortArray.length);
		while (lowIndex1 <= midIndex && lowIndex2 <= highIndex) {
			if (tmpArray[lowIndex1] <= tmpArray[lowIndex2]) {
				sortArray[i] = tmpArray[lowIndex1];
				lowIndex1++;
			} else {
				sortArray[i] = tmpArray[lowIndex2];
				lowIndex2++;
			}
			i++;
		}
		while (lowIndex1 <= midIndex) {
			sortArray[i] = tmpArray[lowIndex1];
			i++;
			lowIndex1++;
		}
		while (lowIndex2 <= highIndex) {
			sortArray[i] = tmpArray[lowIndex2];
			i++;
			lowIndex2++;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 6,4,10,9,3,7,2,1,8 };
		int[] tmp = new int[array.length];
		mergeSort(array, tmp, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

}
