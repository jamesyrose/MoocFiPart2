package Part10;

public class CheckerMain {

	public static void main(String[] args) {
		Checker checker = new Checker();

		String str = "AEIouA";
		String week = "mon";
		String time = "10:10:10";
		
		System.out.println("All Vowels");
		System.out.println(checker.allVowels(str));
		System.out.println(checker.allVowels(week));
		
		System.out.println("Day of Week");
		System.out.println(checker.isDayOfWeek(week));
		System.out.println(checker.isDayOfWeek(str));
		
		System.out.println("is a time");
		System.out.println(checker.timeOfDay(time));

	}
}
