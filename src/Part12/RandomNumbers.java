package Part12;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many numbers do you want");
		int nums = reader.nextInt();
		randomNumbers(nums);
	
	}
	
	public static void randomNumbers(int nums) {
		Random rand = new Random();
		for (int i=0; i<nums; i++) {
			int randNum = rand.nextInt(10);
			System.out.println(randNum);
		}
	}

}
