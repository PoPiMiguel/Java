import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class retoSuma {
    public static void main(String[] args) {
        int punt = 1000;
        int num1 = (int) (Math.random() * 100 + 1);
        int num2 = (int) (Math.random() * 100 + 1);
        int sumCorrect = num1 + num2;
        int sumUsu;
        int intentos = -1;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Suma los siguientes numeros: " + num1 + " + " + num2);
            sumUsu = sc.nextInt();
            intentos ++;

        }while ((punt > 0) && (sumCorrect != sumUsu));

        int quitaPunto = intentos * 50;
        punt = punt - quitaPunto;

        String resp = (sumCorrect == sumUsu) ? "Has acertado con la suma" : "No has acertado la suma";

        System.out.println(resp);
        System.out.println("Tu puntuación es: " + punt);
    }
}