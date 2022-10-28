import java.io.FileNotFoundException;
import java.io.IOException;

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
    void readFromFile() throws IOException {
        urinals urine = new urinals();
        assertThrows(FileNotFoundException.class, () -> urine.readFromFile("abcde.txt") );
    }

    @org.junit.jupiter.api.Test
    void writeToFile() {
    }
}
