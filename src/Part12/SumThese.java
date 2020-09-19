package Part12;

public class SumThese {
	
	public static void main(String[] args) {
		int[] numbers = {3, -1, 8, 4};
		Program prog = new Program();

		System.out.println(prog.sum(numbers, 0, 0, 0, 0));
		System.out.println(prog.sum(numbers, 0, 0, 0, 10));
		System.out.println(prog.sum(numbers, 0, 1, 0, 10));
		System.out.println(prog.sum(numbers, 0, 1, -10, 10));
		System.out.println(prog.sum(numbers, -1, 999, -10, 10));
	}
}
