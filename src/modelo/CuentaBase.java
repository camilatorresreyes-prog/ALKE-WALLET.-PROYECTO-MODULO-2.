package modelo;

import java.util.ArrayList;

public abstract class CuentaBase {

    protected String titular;
    protected double saldoCLP;
    protected int pin;
    protected ArrayList<String> historial;

    public CuentaBase(String titular, double saldoInicial, int pin) {
        this.titular = titular;
        this.saldoCLP = saldoInicial;
        this.pin = pin;
        this.historial = new ArrayList<>();
    }

    public abstract void retirar(double monto);

    public double getSaldoCLP() {
        return saldoCLP;
    }
}
