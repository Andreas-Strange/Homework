package arrays;

public class CalculatingArrays {
	public static void main(String[] args) {

		int odd, even, antalfald;
		int max;
		Double sum = (double) 0;
		Double avr;
		int [] array = {23, 6, 47, 35, 2, 14};

		//		Finding average of array:

		for(int i=0;i<array.length;i++){
			sum = sum + array[i];
		}
		System.out.println("summen: " + sum);

		avr = (sum /array.length);
		System.out.println("Gennemsnittet: " + avr);

		//		Finding highest number in array:
		max = array[0];
		for ( int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max: " + max);

		//		Finding the odd numbers:
		System.out.print("Ulige numre: ");
		for ( int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				odd = array[i];
				System.out.print(" " +odd +" ");
			}
		}
		//		Finding the even numbers:
		System.out.println("");
		System.out.print("lige numre: ");
		for ( int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even = array[i];
				System.out.print(" " +even +" ");
			}
		}
//		Finding number of decreases:
		antalfald = 0;
		for ( int i = 1; i < array.length; i++) {
			
			if(array[i-1] > array[i]){
				antalfald ++;
			}
		}
		System.out.println("");
		System.out.println("Antal Fald: " + antalfald);
	}
}


