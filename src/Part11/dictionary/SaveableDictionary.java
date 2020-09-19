
package Part11.dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
	private HashMap<String, String> dict;
	private String fileName;
	
	public SaveableDictionary() {
		this.dict = new HashMap<>();
	}
	
	public SaveableDictionary(String file) {
		this.fileName = file;
		this.dict = new HashMap<>();
	}
	
	public boolean load() {
		try {
			Scanner reader = new Scanner(Paths.get(this.fileName));
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String[] split = line.split(":");
				this.dict.put(split[0], split[1]);
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public boolean save() {
        try {
			PrintWriter writer = new PrintWriter(this.fileName);
			for (String key: this.dict.keySet()) {
				String buff = key + ":" + this.dict.get(key);
				writer.println(buff);
			}
			writer.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;

	}
	
 
	
	public void add(String word, String translation) {
		this.dict.put(word, translation);
	}
	
	public String translate(String word) {
		return this.dict.get(word);
	}
	
	public void delete(String word) {
		this.dict.remove(word);
	}
}
