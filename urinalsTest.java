import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void goodString(){
        urinals urine = new urinals();
        assertEquals(true,urine.goodString("10001"),"====== Sai Venkat Naresh == TEST TWO EXECUTED =======");
    }

    @org.junit.jupiter.api.Test
    void getUrinalsCountStrings() {
        urinals urine = new urinals();
        assertThrows(NumberFormatException.class,()->urine.getUrinalsCount("abc"));
    }

    @org.junit.jupiter.api.Test
    void readFromFileDNotExist() throws IOException {
        urinals urine = new urinals();
        assertThrows(FileNotFoundException.class ,()-> urine.readFromFile("C:/Users/svnka/ICA8/src/main/java/abcde.dat"));
    }

    @org.junit.jupiter.api.Test
    void readFromFileEmptyFile() throws IOException {
        urinals urine = new urinals();
        ArrayList<String> s = new ArrayList<>();
        assertEquals(s,urine.readFromFile("C:/Users/svnka/ICA8/src/main/java/urinal.dat"));
    }

    @org.junit.jupiter.api.Test
    void numberFormatException() throws IOException {
        urinals urine = new urinals();
        assertThrows(NumberFormatException.class ,()-> urine.getUrinalsCount("abc"));
    }

    @org.junit.jupiter.api.Test
    void IOException() throws IOException {
        urinals urine = new urinals();
        assertThrows(IOException.class ,()-> urine.readFromFile("C:/Users/svnka/ICA8/main/java/inp.txt"));
    }

    @org.junit.jupiter.api.Test
    void writeToFile() {

       
    }
}
