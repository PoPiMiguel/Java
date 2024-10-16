import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class notaExamen {
    public static void main(String[] args) {
        System.out.println(" Introduce tu nota del examen (0-10)");
        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Suspenso ");
            }
            case 5 -> System.out.println("Aprobado, por los pelos ");
            case 6 -> System.out.println("Aprobado, bien ");
            case 7, 8 -> System.out.println("Aprobado, notable ");
            case 9, 10 -> {
                System.out.println("Sobresaliente ");
                if (nota == 9) System.out.println("Muy bien hecho");
                else {
                    System.out.println("Enhorabuena esta perfecto");
                }
            }
            default -> System.out.println("Esa nota no la puedes sacar");

        }
    }
}