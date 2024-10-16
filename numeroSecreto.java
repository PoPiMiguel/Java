import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class numeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero secreto (1-100)");
        System.out.println("Si te rindes introduce -1");
        int numSecreto = (int) (Math.random() * 100 + 1);
        int resp;
        do {
            resp = sc.nextInt();
            if (resp < numSecreto) {
                System.out.println("El número secreto es mas grande");
            } else {
                System.out.println("El numero secreto es mas pequeño");
            }
        } while ((resp != numSecreto) && (resp != -1));
        if (resp == -1) {
            System.out.println("¿Te rindes? Que pena");
        } else {
            System.out.println("Enhorabuena has acertado el numero secreto ");
        }

    }
}