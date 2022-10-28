import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void goodString(){
        urinals urine = new urinals();
        assertEquals(true,urine.goodString("Sai Venkat Naresh"),"====== Sai Venkat Naresh == TEST TWO EXECUTED =======");


    }

    @org.junit.jupiter.api.Test
    void getUrinalsCount() {
    }

    @org.junit.jupiter.api.Test
    void readFromFile() {
    }

    @org.junit.jupiter.api.Test
    void writeToFile() {
    }
}