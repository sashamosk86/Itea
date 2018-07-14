package less08;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		String s3 = null;
		
		long l1 = 0;
		long l2 = 0;
		long l3 = 0;

		boolean errFlag;

		Scanner in = new Scanner(System.in);
		/**
		 * Checking input values for emptiness and integers.
		 */
		do {
			System.out.println("Enter 1st value of numbers:");
			s1 = in.nextLine();
			errFlag = true;
			
			try {
				l1 = Long.parseLong(s1);
			} catch (Exception e) {
				errFlag = false;
				System.out.println("Please enter only integers!\n");
			}
		} while (!errFlag);

		do {
			System.out.println("Enter 2nd value of numbers:");
			s2 = in.nextLine();
			errFlag = true;
			
			try {
				l2 = Long.parseLong(s2);
			} catch (Exception e) {
				errFlag = false;
				System.out.println("Please enter only integers!\n");
			}
		} while (!errFlag);

		do {
			System.out.println("Enter 3rd value of numbers:");
			s3 = in.nextLine();
			errFlag = true;
			
			try {
				l3 = Long.parseLong(s3);
			} catch (Exception e) {
				errFlag = false;
				System.out.println("Please enter only integers!\n");
			}
		} while (!errFlag);
		in.close();

		long[][] arr = new long[3][];

		int evenCounter = 0;
		int oddCounter = 0;
		int threeCounter = 0;

		/**
		 * Creating multidimensional array using string length for indicating array
		 * length. Increment counters when value not equals zero. Filling
		 * multidimensional array with single numbers while parsing whole numbers.
		 */
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = new long[s1.length()];
			} else if (i == 1) {
				arr[i] = new long[s2.length()];
			} else if (i == 2) {
				arr[i] = new long[s3.length()];
			}
			for (int j = arr[i].length - 1; j >= 0; j--) {
				if (i == 0) {
					arr[i][j] = l1 % 10;
					if (arr[i][j] % 2 == 0 && arr[i][j] != 0) {
						evenCounter++;
					} else if (arr[i][j] % 2 == 1) {
						oddCounter++;
					}
					if (arr[i][j] % 3 == 0 && arr[i][j] != 0) {
						threeCounter++;
					}
					l1 /= 10;
				} else if (i == 1) {
					arr[i][j] = l2 % 10;
					if (arr[i][j] % 2 == 0 && arr[i][j] != 0) {
						evenCounter++;
					} else if (arr[i][j] % 2 == 1) {
						oddCounter++;
					}
					if (arr[i][j] % 3 == 0 && arr[i][j] != 0) {
						threeCounter++;
					}
					l2 /= 10;
				} else if (i == 2) {
					arr[i][j] = l3 % 10;
					if (arr[i][j] % 2 == 0 && arr[i][j] != 0) {
						evenCounter++;
					} else if (arr[i][j] % 2 == 1) {
						oddCounter++;
					}
					if (arr[i][j] % 3 == 0 && arr[i][j] != 0) {
						threeCounter++;
					}
					l3 /= 10;
				}
			}
		}

		/**
		 * Displaying created multidimensional array.
		 */
		System.out.println("\nOur array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------");
		System.out.println("EVEN's: " + evenCounter);
		System.out.println("ODD's: " + oddCounter);
		System.out.println("THREE's: " + threeCounter);

		/**
		 * Creating one-dimensional arrays for even, odd and three's numbers. Using
		 * counters for indicating array length.
		 */
		int[] evenArr = new int[evenCounter];
		int[] oddArr = new int[oddCounter];
		int[] threeArr = new int[threeCounter];

		evenCounter = 0;
		oddCounter = 0;
		threeCounter = 0;

		/**
		 * Filling one-dimensional arrays for even, odd and three's numbers excepting
		 * zeros.
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0 && arr[i][j] != 0) {
					evenArr[evenCounter++] = (int) arr[i][j];
				} else if (arr[i][j] % 2 == 1) {
					oddArr[oddCounter++] = (int) arr[i][j];
				}
				if (arr[i][j] % 3 == 0 && arr[i][j] != 0) {
					threeArr[threeCounter++] = (int) arr[i][j];
				}
			}
		}

		System.out.println("--------------");
		System.out.println("EVEN ARRAY: " + Arrays.toString(evenArr));
		System.out.println("ODD ARRAY: " + Arrays.toString(oddArr));
		System.out.println("THREE ARRAY: " + Arrays.toString(threeArr));

	}

}
