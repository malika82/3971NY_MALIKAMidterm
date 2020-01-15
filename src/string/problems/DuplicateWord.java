package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        Map<String, Integer> duplicateWord = new HashMap<>();
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String st1 = st.toLowerCase();
        String[] stringWords = st1.split(" ");
        // adding the words into the Map;
        // if the word exist in the map we need to increment its value bye 1;
        //else if this the first time then put 1 for its value;

        for (String str : stringWords) {
            if (duplicateWord.get(str) != null) {
                duplicateWord.put(st, duplicateWord.get(str) + 1);

            } else {
                duplicateWord.put(str, 1);

            }

            duplicateWord.forEach((k,v) -> System.out.println("Key = "
                    + k + ", Value = " + v));
        }
    }

}
