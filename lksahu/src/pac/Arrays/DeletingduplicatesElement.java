package pac.Arrays;

public class DeletingduplicatesElement {

	public static int countUnique(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length - 1; i++) {
 			if (A[i] == A[i + 1]) {
				count++;
			}
		}
		return (A.length-count);
	}
	 
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		int size = countUnique(arr);
		System.out.println(size);
		}
}
