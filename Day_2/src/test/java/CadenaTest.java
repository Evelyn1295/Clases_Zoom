import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.naming.CannotProceedException;

import static org.junit.jupiter.api.Assertions.*;


class CadenaTest {

    private static Cadena cadena;

    //
    @BeforeAll
    public static  void setUp(){ cadena = new Cadena("12");}
    @Test
    void convertIntTest() {
        String a = "12";
        assertThrows(IllegalArgumentException.class, () -> cadena.convertInt(a));
    }

    @Test
    void convertNullTest() {
        String a = " ";
        assertThrows(IllegalArgumentException.class, () ->cadena.convertInt(a));
    }

    @Test
    void divIntTest() {

        int a = 1;
        int b = 1;

        assertThrows(ArithmeticException.class, () -> cadena.divInt(a,b));
        //assertEquals(1,divInt(a,b));
    }

    }