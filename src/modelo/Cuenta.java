package modelo;


import java.io.FileWriter;
import java.io.IOException;

public class Cuenta extends CuentaBase {

    private double acumuladoRetiroDiario = 0;
    private final double LIMITE_MAXIMO = 200000;

    public Cuenta(String titular, double saldoInicial, int pin) {
        super(titular, saldoInicial, pin);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldoCLP += monto;
            historial.add("Depósito: +$" + monto + " CLP");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto <= 0 || monto > saldoCLP) {
            System.out.println("❌ Retiro inválido.");
            return;
        }

        if (acumuladoRetiroDiario + monto > LIMITE_MAXIMO) {
            System.out.println("❌ Límite diario superado.");
            return;
        }

        saldoCLP -= monto;
        acumuladoRetiroDiario += monto;
        historial.add("Retiro: -$" + monto + " CLP");
    }

    public void exportar() {
        try (FileWriter fw = new FileWriter("historial.txt")) {
            for (String h : historial) {
                fw.write(h + "\n");
            }
            System.out.println("✅ Historial exportado.");
        } catch (IOException e) {
            System.out.println("❌ Error al exportar historial.");
        }
    }
}
