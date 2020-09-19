package Part11.dictionary;

public class SaveableDictMain {
	public static void main(String[] args) {
		SaveableDictionary dictionary = new SaveableDictionary();
		dictionary.add("apina", "monkey");
		dictionary.add("banana", "bananani");
		dictionary.add("monkey", "apina");

		System.out.println(dictionary.translate("apina"));
		System.out.println(dictionary.translate("monkey"));
		System.out.println(dictionary.translate("ohjelmointi"));
		System.out.println(dictionary.translate("banana"));
		
		
		SaveableDictionary dictionary2 = new SaveableDictionary("src/Part11/dictionary/words.txt");
		boolean wasSuccessful = dictionary2.load();

		if (wasSuccessful) {
		    System.out.println("Successfully loaded the dictionary from file");
		}

		System.out.println(dictionary2.translate("apina"));
		System.out.println(dictionary2.translate("ohjelmointi"));
		System.out.println(dictionary2.translate("alla oleva"));
		
		dictionary2.add("apina", "monkey");
		dictionary2.add("banana", "bananani");
		dictionary2.add("monkey", "apina");
		boolean saved = dictionary2.save();
		if (saved) {
			System.out.println("Dict successfully saved");
		}

	}
}
