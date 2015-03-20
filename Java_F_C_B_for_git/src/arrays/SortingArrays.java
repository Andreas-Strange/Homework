package arrays;
import java.util.Arrays;

public class SortingArrays {
	public static void main(String[] args) {

		int[] aryNums;
		aryNums = new int[6];


		aryNums[0] = 47;
		aryNums[1] = 20;
		aryNums[2] = 15;
		aryNums[3] = 8;
		aryNums[4] = 4;
		aryNums[5] = 2;

		Arrays.sort(aryNums);

		int i;

		for(i=0; i <aryNums.length; i++){

			System.out.println(aryNums[i]);
			
		}
	}
}
