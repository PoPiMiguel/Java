import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mundo {
    public static void main(String[] args) {
        //Pedimos el hemosferio en el que se encuentra
        System.out.println("¿En que hemisferio te encuentras? N/S");
        Scanner sc = new Scanner(System.in);
        String hemisferio = sc.nextLine();
        //Ahora pedimos el lado
        System.out.println("¿En que lado te encuentras? E/O");
        String parteDelMundo = sc.nextLine();

        if (hemisferio.equals("N")) { //Si el hemosferio es norte
            if (parteDelMundo.equals("O")) {
                System.out.println("Estas en América del norte");
            } else if (parteDelMundo.equals("E")) {
                System.out.println("Estas en Europa");
            }
        } else if (hemisferio.equals("S")) {
            if (parteDelMundo.equals("O")) {
                System.out.println("Estas en América del sur");
            } else if (parteDelMundo.equals("E")) {
                System.out.println("Estas en África");
            }
        }
    }
}