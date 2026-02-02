import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Cuenta;

class CuentaBaseTest {

    @Test
    void testHerenciaAtributos() {
        // Validamos que los datos guardados en la "Base" se recuperan bien desde la "Hija"
        Cuenta cuenta = new Cuenta("Cami", 5000, 1234);
        
        assertEquals("Cami", cuenta.getTitular(), "El nombre heredado es incorrecto");
        assertEquals(1234, cuenta.getPin(), "El PIN heredado es incorrecto");
    }
}