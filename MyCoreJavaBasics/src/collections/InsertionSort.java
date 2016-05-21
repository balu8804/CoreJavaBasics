package collections;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[] { 5, 7, 6, 4, 3, 9, 8 };
		int tmp;
		int j;
		for(int i=1;i<array.length;i++)
		{
			tmp=array[i];
			for( j=i;j>0 &&tmp<array[j-1];j--)
			{
				array[j]=array[j-1];
			}
			array[j]=tmp;
		}
		System.out.println(Arrays.toString(array));

	}
}
