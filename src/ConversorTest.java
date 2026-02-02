
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import servicio.Conversor;

class ConversorTest {

    @Test
    void testConversionDolarAPeso() {
        // Si el dólar está a 900 y tengo 10 USD, debo tener 9000 pesos
        Conversor.setTasa(900.0);
        double resultado = Conversor.usdAClp(10.0);
        assertEquals(9000.0, resultado, "La conversión de USD a CLP falló");
    }

    @Test
    void testConversionPesoADolar() {
        // Si tengo 9000 pesos y el dólar está a 900, debo tener 10 USD
        Conversor.setTasa(900.0);
        double resultado = Conversor.clpAUsd(9000.0);
        assertEquals(10.0, resultado, "La conversión de CLP a USD falló");
    }
}