package pe.edu.tecsup.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void obtenerSuma(){

        int expectedValue = 16;

        Main main = new Main();

        int resultado = main.obtenerSuma(5);

        assertEquals(expectedValue, resultado);


    }
}
