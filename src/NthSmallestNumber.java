import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {
	public static void main(String[] args) {

		// Get the value of N from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N: ");

		int N = scanner.nextInt();
		scanner.close();

		// Generate an array of 500 random numbers
		int[] numbers = new int[500];
		Random random = new Random();
		for (int i = 0; i < 500; i++) {

			// Generate random numbers between 0 and 999
			numbers[i] = random.nextInt(1000);
		}

		// Sort the array in ascending order

		Arrays.sort(numbers);
		
		// Print the Nth smallest number
		System.out.println("The " + N + "th smallest number is: " + numbers[N - 1]);
	}
}