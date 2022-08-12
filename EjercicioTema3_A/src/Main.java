public class Main {
    public static void main(String[] args) {
        int numA = 5;
        int numB = 7;
        int numC = 13;
        System.out.println("La suma: "+numA+"+"+numB+"+"+numC+" es igual a "+suma_Valor(numA,numB,numC));
    }
    public static int suma_Valor(int numA, int numB, int numC) {
        return numA + numB + numC;
    }
}