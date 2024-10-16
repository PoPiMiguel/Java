import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class conjuntoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        System.out.println("Hasta que no introduzca el numero 0 no terminara la opercación");
        int num = sc.nextInt();
        while (num != 0) {
            //Haremos el cuadrado del numero introducido
            double potencia = Math.pow(num, 2);

            //Comprobamos que el numero sea par
            String esPar = ((num % 2) == 0) ? " es par" : "es Impar";

            //Comprobamos que sea positivo o negativo
            String esPos = (num > 0) ? "es positivo" : "es negativo";

            System.out.println(" El Número " + num + " " + esPar + " " + esPos + " y su cuadrado es: " + potencia);

            System.out.println("Dime otro numero");
            Scanner rt = new Scanner(System.in);
            num = rt.nextInt();
        }
    }
}
