package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		int[] array = new int[] { 80, 45, 7, 6, 52, 46, 11 };
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
					
				}
			}
		}
            System.out.println(Arrays.toString(array));

		

	}

}
