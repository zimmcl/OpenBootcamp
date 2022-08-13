import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        funcionIF(-6.5f);
        funcionIF(4.5f);
        funcionIF(-0f);
        funcionIF(0);
        funcionWHILE();
        funcionDOWHILE();
        funcionFOR();
        String estacion = "VERAno";
        estacion = estacion.toLowerCase().substring(0, 1).toUpperCase() + estacion.toLowerCase().substring(1);
        funcionSWITCH(estacion);
    }

    public static void funcionIF(float numeroIf) {
        if (numeroIf > 0) {
            System.out.println(numeroIf + " es mayor que 0");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es menor que 0");
        } else {
            System.out.println(numeroIf + " es 0");
        }
    }

    public static void funcionWHILE() {
        int numeroWhile = -1;
        while (numeroWhile < 3) {
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile++;
        }
    }

    public static void funcionDOWHILE() {
        int numeroDoWhile = 0;
        do {
            System.out.println("numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 0);
    }

    public static void funcionFOR() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor: " + numeroFor);
        }
    }

    public static void funcionSWITCH(String estacion) {
        switch (estacion) {
            case "Verano":
                System.out.println("(1) La estación es :" + estacion);
                break;
            case "Otoño":
                System.out.println("(2) La estación es :" + estacion);
                break;
            case "Invierno":
                System.out.println("(3) La estación es :" + estacion);
                break;
            case "Primavera":
                System.out.println("(4) La estación es :" + estacion);
                break;
            default:
                System.out.println("¿Qué quieres decir con " + estacion + "?");

        }
    }
}
