import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		// With Shuffle and Collection Method
//		Integer[] intArray = {(1, 2, 3, 4, 5, 6, 7 };
//
//		List<Integer> intList = Arrays.asList(intArray);
//
//		Collections.shuffle(intList);
//
//		intList.toArray(intArray);
//
//		System.out.println(Arrays.toString(intArray));

		// Without shuffle and collection method

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			int randomIndexToSwap = rand.nextInt(arr.length);
			int temp = arr[randomIndexToSwap];
			arr[randomIndexToSwap] = arr[i];
			arr[i] = temp;

		}
		System.out.println(Arrays.toString(arr));

	}
}
