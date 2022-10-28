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
    void getUrinalsCount() {
    }

    @org.junit.jupiter.api.Test
    void readFromFileDNotExist() throws IOException {
        urinals urine = new urinals();
        ArrayList<String> s = new ArrayList<>();
        assertThrows(FileNotFoundException.class ,()-> urine.readFromFile("C:/Users/svnka/ICA8/src/main/java/abcde.txt"));
    }

    @org.junit.jupiter.api.Test
    void readFromFileEmptyFile() throws IOException {
        urinals urine = new urinals();
        ArrayList<String> s = new ArrayList<>();
        assertEquals(s,urine.readFromFile("C:/Users/svnka/ICA8/src/main/java/input.txt"));
    }

    @org.junit.jupiter.api.Test
    void writeToFile() {

    }
}
