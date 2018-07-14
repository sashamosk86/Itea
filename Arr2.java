
import javax.swing.plaf.synth.SynthStyleFactory;

public class Arr2 {
	public Object[][] getData() {
		Object[][] data = new String[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					data[i][j] = "1a";
				} else if (j == 1) {
					data[i][j] = "2b";
				} else if (j == 2) {
					data[i][j] = "3c";
				} else if (j == 3) {
					data[i][j] = "4d";
				}
			}
		}
		return data;
	}

	public static void main(String[] args) {
		
		
		/*
		int[] arr1 = { 1, 2, 3 };
		// int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = new int[5][];
		arr2[0] = new int[] { 1, 2, 3 };
*/
		// System.out.println(arr2[1][2]);
		int a = (int)(Math.random()*6+3);
		int[][] arr = new int[a][];
		for (int i = 0; i < arr.length; i++) { 
			a = (int)(Math.random()*6+5); 
			arr[i] = new int[a]; 
			for (int j = 0; j < arr[i].length; j++) { 
				int elem = (int)(Math.random()*101); 
				arr[i][j] = elem; 
				} 
			}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i])); 
		}
		
		System.out.println(Arrays.deepToString(arr));
		

		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
		 * j++) { System.out.print(arr[i][j] + " "); } System.out.println(); }
		 */

		
		
		 //System.out.println();
		 
		int arrLength = (int)(Math.random()*6+3); 
		int[][][] arr3 = new int[arrLength][][];
		
		for (int i = 0; i < arr3.length; i++) { 
			arrLength = (int)(Math.random()*6+5);
			arr3[i] = new int[arrLength][];
			
		for (int j = 0; j < arr3[i].length; j++) { 
			arrLength = (int)(Math.random()*6+5); 
			arr3[i][j] = new int[arrLength];
			
			for (int k = 0; k < arr3[i][j].length; k++) { 
				int e = (int)(Math.random()*101); 
				arr3[i][j][k] = e; 
				} 
			} 
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i])); 
			}
		
		/* 
		 * System.out.println(Arrays.deepToString(arr3));
		 * 
		 */
		/*
		 * int arrLength = (int) (Math.random() * 6 + 3); int[][] arr = new
		 * int[arrLength][];
		 * 
		 * for (int i = 0; i < arr.length; i++) { arrLength = (int) (Math.random() * 6 +
		 * 5); arr[i] = new int[arrLength]; for (int j = 0; j < arr[i].length; j++) {
		 * int elem = (int) (Math.random() * 101); arr[i][j] = elem; } }
		 * 
		 * System.out.println(Arrays.deepToString(arr));
		 */

		/*
		 * for (int i = 0; i < arr.length; i++) { //arr[i] for (int k = 0; k <
		 * arr[i].length; k++) { for (int j = 0; j < arr[i].length - 1 - k; j++) { if
		 * (arr[i][j] > arr[i][j + 1]) { int swap = arr[i][j]; arr[i][j] = arr[i][j +
		 * 1]; arr[i][j + 1] = swap; } } } }
		 * 
		 * System.out.println(Arrays.deepToString(arr)); /* for (int i = 0; i <
		 * arr.length; i++) { System.out.println(Arrays.toString(arr[i])); }
		 */
		/*
		 * int arrVal = 11;
		 * 
		 * char[][] arr4 = new char[arrVal][arrVal];
		 * 
		 * for (int i = 0; i < arr4.length; i++) {
		 * 
		 * for (int j = 0; j < arr4[i].length; j++) {
		 * 
		 * if (i == 0 || i == arr4.length - 1 || j == 0 || j == arr4[i].length - 1 ||
		 * (i==arr4.length/2 && j==arr4.length/2)|| (i==arr4.length/2-1 &&
		 * j==arr4.length/2)|| (i==arr4.length/2+1 && j==arr4.length/2)||
		 * (i==arr4.length/2 && j==arr4.length/2-1)|| (i==arr4.length/2 &&
		 * j==arr4.length/2+1)) { arr4[i][j] = '*'; }else { arr4[i][j] = ' '; } } }
		 * 
		 * 
		 * 
		 * for (int i = 0; i < arr4.length; i++) {
		 * System.out.println(Arrays.toString(arr4[i])); }
		 */
	}

}
