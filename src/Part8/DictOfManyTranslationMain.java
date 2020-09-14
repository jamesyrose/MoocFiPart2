package Part8;

public class DictOfManyTranslationMain {

	public static void main(String[] args) {
		DictOfManyTranslations dictionary = new DictOfManyTranslations();
		dictionary.add("lie", "maata");
		dictionary.add("lie", "valehdella");

		dictionary.add("bow", "jousi");
		dictionary.add("bow", "kumartaa");

		System.out.println(dictionary.translate("lie"));
		dictionary.remove("bow");
		System.out.println(dictionary.translate("bow"));
	}

}
