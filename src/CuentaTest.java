import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import modelo.Cuenta;
import servicio.Conversor;

class CuentaTest {

    @Test
    void testRetiroDentroDelLimite() {
        Cuenta cuenta = new Cuenta("Test", 100000.0, 1234);
        cuenta.retirar(50000.0);
        assertEquals(50000.0, cuenta.getSaldoCLP());
    }

    @Test
    void testExcederLimiteDiario() {
        Cuenta cuenta = new Cuenta("Test", 500000.0, 1234);
        cuenta.retirar(250000.0);
        assertEquals(500000.0, cuenta.getSaldoCLP());
    }

    @Test
    void testRetirosAcumulados() {
        Cuenta cuenta = new Cuenta("Test", 300000.0, 1234);
        cuenta.retirar(150000.0);
        cuenta.retirar(60000.0);
        assertEquals(150000.0, cuenta.getSaldoCLP());
    }

    @Test
    void testDepositoUSD() {
        Conversor.setTasa(1000.0);
        Cuenta cuenta = new Cuenta("Test", 0.0, 1234);
        cuenta.depositar(Conversor.usdAClp(50.0));
        assertEquals(50000.0, cuenta.getSaldoCLP());
    }
}