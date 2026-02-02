package modelo;

public interface Operaciones {
    // Estas son las "reglas" que cualquier cuenta debe cumplir
    void depositar(double monto);
    void retirar(double monto);
    void exportar();
}