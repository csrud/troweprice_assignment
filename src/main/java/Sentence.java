import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Sentence {

    public static String getLongestWordAndLength(String str) {
        if (str.equals("") || str.length() == 0) {
            return "Empty Sentence";
        }
        //remove extra spaces between words
        //remove special characters except "'-" which are part of word
        //remove numbers
        String[] arr = str
                .replaceAll("\\s+", " ")
                .replaceAll("[^a-zA-Z\\s-']", "").split(" ");
        //sentence has only special characters or numbers
        if(arr[0].equals("")) {
            return "Invalid Sentence";
        }
        String longestWord = Arrays.stream(arr)
                .filter(s -> s.length() != 0) //remove elements which became zero length
                .max(Comparator.comparing(String::length))
                .orElseThrow(NoSuchElementException::new);
        return longestWord + ", " + longestWord.length();
    }

    public static String getShortestWordAndLength(String str) {
        if (str.equals("") || str.length() == 0) {
            return "Empty Sentence";
        }
        //remove extra spaces between words
        //remove special characters except "'-" which are part of word
        //remove numbers
        String[] arr = str
                .replaceAll("\\s+", " ")
                .replaceAll("[^a-zA-Z\\s-']", "").split(" ");
        //sentence has only special characters or numbers
        if(arr[0].equals("")) {
            return "Invalid Sentence";
        }
        String shortestWord = Arrays.stream(arr)
                .filter(s -> s.length() != 0) //remove elements which became zero length
                .min(Comparator.comparing(String::length))
                .orElseThrow(NoSuchElementException::new);
        return shortestWord + ", " + shortestWord.length();
    }
}
