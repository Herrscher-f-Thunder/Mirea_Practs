package Pract31;
//import jdk.jpackage.main.Main;
import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testIsValidStringValidInput() {
        assertTrue(Main.isValidString("127.0.0.1"));
        assertTrue(Main.isValidString("255.255.255.0"));
    }

    @Test
    public void testIsValidStringInvalidInput() {
        assertFalse(Main.isValidString("1300.6.7.8"));
        assertFalse(Main.isValidString("abc.def.gha.bcd"));
    }
}
