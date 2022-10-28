/*
@author Sai Venkat Naresh Kasaragadda, skasara1@asu.edu
 */
import java.io.*;
import java.util.ArrayList;

public class urinals {

    Boolean goodString(String str) {  // checks to see if valid string
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static int getUrinalsCount(String s) {

        return 0;
    }

    public static ArrayList<Integer> readFromFile(String path) throws IOException {

        return null;
    }

    public static void writeToFile(ArrayList<Integer> outputs) throws IOException {

    }


    public static void main(String args[]) throws IOException {

    }
}
