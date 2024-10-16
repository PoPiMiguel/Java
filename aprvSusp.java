import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aprvSusp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las notas que tienes: ");
        int numAp = 0;
        int numSus = 0;
        int numCon = 0;
        int nota;
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingresa tu nota");
            nota = sc.nextInt();
            if (nota > 5) {
                numAp++;
            } else if (nota < 4) {
                numSus++;
            } else {
                numCon++;
            }
        }
        System.out.println("Tienes " + numAp + " asignaturas aprovadas " + numCon + " asignaturas condicionadas " + numSus + " asignaturas suspensas");
    }
}