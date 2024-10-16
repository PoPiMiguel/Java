import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class diaSemana {
    public static void main(String[] args) {
        System.out.println("Indique un numero de la semana (1-7)");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1 -> System.out.println("El primer día de la semana es Lunes");
            case 2 -> System.out.println("El segundo día de la semana es Martes");
            case 3 -> System.out.println("El tercer día de la semana es Miercoles");
            case 4 -> System.out.println("El cuarto día de la semana es Jueves");
            case 5 -> System.out.println("El quinto día de la semana es Viernes");
            case 6 -> System.out.println("El sexto día de la semana es Sábado");
            case 7 -> System.out.println("El séptimo día de la semana es Domingo");
            default -> System.out.println("Ese numero de la semana no existe");
        }
    }
}