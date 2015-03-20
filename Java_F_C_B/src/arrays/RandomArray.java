package arrays;

public class RandomArray {
	public static void main(String[] args) {
		
		int[] random_numbers = new int[11];
		
		for (int i=0; i<random_numbers.length; i+=2){
			random_numbers[i] = i + 0;
			System.out.println(random_numbers[i]);
		}
		
	}

}
