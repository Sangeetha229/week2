

import java.lang.*;

public class reversechars912 {

    public static char[] reverseWords1(char[] chararray) {

        int start = 0;

        int len = chararray.length;
        for (int pointerindex = 0; pointerindex < chararray.length; pointerindex++) {

            if (chararray[pointerindex] == ' ') { // reverse each word till blank
                reverse1(chararray, start, pointerindex - 1);
                start = pointerindex + 1;

            }

        }
        reverse1(chararray, start, len - 1);// above step leaves ot last word as there is no space in the end so again call this method
        reverse1(chararray, 0, len - 1);// reverse whole char array
        return chararray;
    }

    public static void reverse1(char[] chararrayword, int start, int end) {// reverse each word with start and end pointers.
        while (start <= end) {
            char temp = chararrayword[start];
            chararrayword[start] = chararrayword[end];
            chararrayword[end] = temp;
            start++;
            end--;
        }

    }

    // Driver Code
    public static void main(String[] args) {
        char[] message = {'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l'};


        char[] result = reverseWords1(message);
        System.out.println(result);
    }
}