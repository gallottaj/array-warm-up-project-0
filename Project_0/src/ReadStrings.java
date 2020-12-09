import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class ReadStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String line = "";
		String temp;
		
		//new scanner to read text file 
		Scanner inputFile = new Scanner(new File("input.txt")).useDelimiter(",\\s*");
		
		//declare the array with a capacity for 10,000 strings
		List<String> words = new ArrayList<String>(10000);
		
		//program that reads a text file and stores each word in an array
		while (inputFile.hasNext()) {
			line = inputFile.next();
			words.add(line);
		}
			inputFile.close();
			String[] wordsArray = words.toArray(new String[0]);
			
			for (String s : wordsArray) {
				//use to test
				//System.out.println(s);
			}
			
		//implement bubble sort to sort by alphabetical order
			for (int j = 0; j < wordsArray.length; j++) {
				for (int i = j + 1; i < wordsArray.length; i++) {
					if (wordsArray[i].compareTo(wordsArray[j]) < 0) {
						temp = wordsArray[j];
						wordsArray[j] = wordsArray[i];
						wordsArray[i] = temp;
					}
				}
				System.out.println(wordsArray[j]);
			}	
	}
}
