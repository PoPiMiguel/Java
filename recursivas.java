import java.util.Scanner;

public class recursivas {
    public static void main(String[] args) {
        System.out.println("Dime el número n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Cambiando la opcion factorialx(n) usaremos los diferentes metodos
        int numeroFactorial = factorial(n);
        System.out.println("El factorial de " + n + " es: " + numeroFactorial);
    }
    //Metodo 1
    public static int factorial(int n) {
        int resultado;
        if (n == 0) {
            resultado = 1;
        } else {
            resultado = n * factorial(n - 1);
        }
        return resultado;
    }
    //Metodo 2
    public static int factorial2(int n) {
        int resultado = n;
        for (int i = n - 1; i >= 1; i--) {
            n = n*i;
            resultado = n;
        }
        return resultado;
    }
}
