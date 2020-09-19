package Part12;

public class Program {

	
	public static int sum(int[] array, int start, int end, int smallest, int largest) {
		if (start < 0) {
			start = 0;
		}
		if (end >= array.length) {
			end = array.length - 1;
		}
		int sum = 0;
		for (int i=start; i<end + 1; i++) {
			int buff = array[i];
			if (buff >= smallest && buff <= largest) {
				sum += buff;
			}
		}
		return sum;
	}
}
