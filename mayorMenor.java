import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class mayorMenor {
    public static void main(String[] args) {
        //Pediremos 3 numeros aleatorios
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe otro numero");
        int num2 = sc.nextInt();
        System.out.println("Escribe un último numero");
        int num3 = sc.nextInt();
        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("El orden de mayor a menor sera este: " + num1 + " " + num2 + " " + num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            System.out.println("El orden de mayor a menor sera este: " + num1 + " " + num3 + " " + num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            System.out.println("El orden de mayor a menor sera este: " + num2 + " " + num1 + " " + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            System.out.println("El orden de mayor a menor sera este: " + num2 + " " + num3 + " " + num1);
        } else if ((num3 > num2) && (num2 > num1)) {
            System.out.println("El orden de mayor a menor sera este: " + num3 + " " + num2 + " " + num1);
        } else {
            System.out.println("El orden de mayor a menor sera este: " + num3 + " " + num1 + " " + num2);

        }
    }
}