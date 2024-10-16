import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ingresoImpuesto {
    public static void main(String[] args) {
        System.out.println("Introduce tu ingreso anual");
        Scanner sc = new Scanner(System.in);
        int ingresos = sc.nextInt();
        int caso = 1;
        if (ingresos >= 10000 && ingresos <= 50000) {
            caso = 2;
        } else if (ingresos > 50000 && ingresos <= 100000) {
            caso = 3;
        }
        int impuestos = switch (caso) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            default -> -1;
        };
        System.out.println("Pagas un " + impuestos + "% de impuestos");

    }
}
