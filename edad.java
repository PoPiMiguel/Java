import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date fechaActual = new Date();
        System.out.println("Introduce tu año de nacimiento");

        int fechaNacimiento = sc.nextInt();
        int annoActual = fechaActual.getYear() + 1900;
        int edad = annoActual - fechaNacimiento;
        System.out.println("Tienes: " + edad + " años");
        if ((edad >= 0) && (edad <= 50)){
            System.out.println( "Entras en el rango de edad de la ZONA 1");
        } else if ((edad >= 50) && (edad <=100)) {
            System.out.println("Estas en el rango de edad de la ZONA 2");
        } else if ((edad >= 100) && (edad <= 1000)){
            System.out.println("Estas en el ranfo de edad de la ZONA 3");
        }
    }
}