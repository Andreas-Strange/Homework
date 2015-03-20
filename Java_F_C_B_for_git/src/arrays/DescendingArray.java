package arrays;
import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {
	public static void main(String[] args) {

		//		Først oprettes tilfældig array:

		int[] rand_array = {11,7,15,33,62,2,9,42};

		//		Det udskrives:
		System.out.println("Random Array:");
		for (int i=0; i<rand_array.length;i++){
			
			System.out.print(" " + rand_array[i]+ " ");
		}
		//		Array sorteres:

		Arrays.sort(rand_array);

		//		Kalder omdøber det sorterede array:	

		int[] sort_array = rand_array;

		//		Det udskrives:
		System.out.println("");
		System.out.println("Sorted Array:");
		for (int i=0; i<rand_array.length;i++){
			
			System.out.print(" " + sort_array[i] + " ");
		}
		//		Laver et faldende array:

		Integer [] des_array = new Integer[sort_array.length];

		for (int i=0; i<sort_array.length;i++){
			des_array[i] = new Integer (sort_array[i]);

			
		} 
		Arrays.sort(des_array, Collections.reverseOrder());
		System.out.println("");
		System.out.println("Descending Array:");
		for (int i=0; i<des_array.length;i++){
			
			System.out.print(" " + des_array[i] + " "); 
		}

	}

}
