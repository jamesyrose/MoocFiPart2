package Part10;

public class Checker {

	public boolean isDayOfWeek(String string) {
		String re = "(mon|tue|wed|thu|fri|sat|sun)";
		return string.matches(re);
	}
	
	public boolean allVowels(String string) {
		return string.toLowerCase().matches("[aeiou]+");
	}
	
	public boolean timeOfDay(String string) {
		String re = "([2][0-3]|[0-1][0-9]|[1-9]):[0-5][0-9]:([0-5][0-9]|[6][0])";
		return string.matches(re);
	}
}
