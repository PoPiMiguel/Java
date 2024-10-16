import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class numSecreto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSecreto = (int) (Math.random() * 100 + 1);
        System.out.println("Adivina el numero secreto del 1 al 100");
        System.out.println("Si te quieres rendir introduce -1");
        int resp = sc.nextInt();

        while ((resp != numSecreto) && (resp != -1)){

            //Mensaje en caso de que sea mas grande o mas pequeño
            if (resp < numSecreto) {
                System.out.println("El número secreto es mas grande");
            } else {
                System.out.println("El numero secreto es mas pequeño");
            }
            System.out.println("Ese numero no es, prueba otro");
            Scanner rt = new Scanner(System.in);
            resp = rt.nextInt();

        }
        if (resp == -1) {
            System.out.println("¿Te rindes? Que pena");
        }else {
            System.out.println("Enhorabuena has acertado el numero secreto ");
        }
    }
}