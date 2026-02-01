package principal;

import modelo.Cuenta;
import servicio.Conversor;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BILLETERA VIRTUAL ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Crear cuenta
        Cuenta cuenta = new Cuenta(nombre, 0, 1234);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Depositar CLP");
            System.out.println("2. Retirar CLP");
            System.out.println("3. Ver saldo CLP y USD");
            System.out.println("4. Exportar historial");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Monto a depositar (CLP): ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    System.out.println("✅ Depósito realizado.");
                    break;

                case 2:
                    System.out.print("Monto a retirar (CLP): ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 3:
                    double saldoCLP = cuenta.getSaldoCLP();
                    double saldoUSD = Conversor.clpAUsd(saldoCLP);

                    System.out.println("Saldo CLP: $" + saldoCLP);
                    System.out.println("Saldo USD: $" + String.format("%.2f", saldoUSD));
                    break;

                case 4:
                    cuenta.exportar();
                    break;

                case 5:
                    System.out.println("👋 Gracias por usar la billetera.");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
