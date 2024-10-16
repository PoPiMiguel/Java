import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cajeroAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero = (int) (Math.random() * 10000);
        System.out.println("¿Qué desea hacer, retirar, ingresar o visualizar? 1/2/3");
        System.out.println("Usted tiene actualmente " + dinero + "€");
        int opcion = sc.nextInt();
        int caso = 0;
        switch (opcion) {
            case 1:
                System.out.println("¿Cuanto dinero desea retitrar?");
                int retirada = sc.nextInt();
                if (dinero >= retirada) {
                    int dineroRestante = dinero - retirada;
                    System.out.println("Ahora te quedan " + dineroRestante + "€");
                } else {
                    System.out.println("No tienes esa cantidad de dinero");
                }
                break;
            case 2:
                System.out.println("¿Cuanto dinero desea ingresar?");
                int ingreo = sc.nextInt();
                int dineroTotal = dinero + ingreo;
                System.out.println("El ingreso ha procedido correctamente");
                System.out.println("Ahora tiene " + dineroTotal + "€ en su cuenta");
                break;
            case 3:
                System.out.println("Su cuenta actualmente tiene " + dinero + "€");
                break;
            default:
                System.out.println("Esa opcion no es correcta");
                break;
        }
    }
}