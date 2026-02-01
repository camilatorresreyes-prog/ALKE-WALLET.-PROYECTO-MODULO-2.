package servicio;

public class Conversor {

    private static double tasaClp = 873.36;

    public static double clpAUsd(double pesos) {
        return pesos / tasaClp;
    }

    public static double usdAClp(double dolares) {
        return dolares * tasaClp;
    }

    public static void setTasa(double nuevaTasa) {
        if (nuevaTasa > 0) {
            tasaClp = nuevaTasa;
        }
    }
}