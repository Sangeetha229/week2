package week5;

import java.util.Locale;

public class Stringwordfrequency511 {


    public static int compare(String[] book, String word) {
        if (book == null || word == null || word.equals("") || book.length == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            word = word.toLowerCase().trim();
            book[i] = book[i].toLowerCase().trim();
            if (book[i].equals(word))
                count++;
        }
        return count;
    }


    public static void main(String... args) {
        String[] book = {"The", "dog", "jumped", "in", "the", "dog  ", "dog", "house"};
        int result = compare(book, "dog");
        System.out.println(result);
    }
}

