import java.util.Scanner;

public class divisoresPrimos {
    public static void main(String[] args) {
        System.out.println("Dime el numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numDivis = divisoresPrimos(numero);
        System.out.println("El numero " + numero + " tiene " + numDivis + " divisores primos.");

    }

    static int divisoresPrimos(int numero) {
        int numeroDivisoresPrimos = 0;
        //Voy a ir recorriendo de 2 hasta numero -1
        //Y voy a comprobar si ese iterador divide a mi numero
        for (int i = 2; i < numero; i++) {
            //Pregunto si i divide a numero
            if (numero % i == 0) {
                //Lo divide y entonces pregunto si i es primo
                if (numPrimo(i)) {
                    numeroDivisoresPrimos++;
                }
            }
        }
        return numeroDivisoresPrimos;
    }

    static boolean numPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
