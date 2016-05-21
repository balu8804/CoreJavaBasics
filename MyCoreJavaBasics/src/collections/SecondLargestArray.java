package collections;

public class SecondLargestArray {
	int highest;
	int secondhighest;

	public int findSecondLargestNumber() {
		int[] array = new int[] { 52, 45, 7, 98, 46, 32, 28, 78, 62, 13, 85 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {
				secondhighest = highest;
				highest = array[i];
			} else if (array[i] > secondhighest) {
				secondhighest = array[i];
			}

		}
		return secondhighest;
	}

	public static void main(String[] args) {
		SecondLargestArray secondnumber = new SecondLargestArray();
		int secondhighest = secondnumber.findSecondLargestNumber();
		System.out.println("Second Highest Number is: " + secondhighest);

	}
}