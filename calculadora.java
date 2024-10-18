import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 3 números: ");
        System.out.println("El tercer número solo se usará en el caso 5 (Media Aricmética)");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        int resp;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Media aricmética");
            System.out.println("6- Potencia");
            System.out.println("0- Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    float suma = suma(num1, num2);
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma(num1, num2));
                    break;
                case 2:
                    float resta = resta(num1, num2);
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta(num1, num2));
                    break;
                case 3:
                    float multiplicar = multi(num1, num2);
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multi(num1, num2));
                    break;
                case 4:
                    float dividir = div(num1, num2);
                    System.out.println("La división de " + num1 + " y " + num2 + " es: " + div(num1, num2));
                    break;
                case 5:
                    //Aqui es el unico caso en el que utilizaremos la variable num3
                    float aricmetica = media(num1, num2, num3);
                    System.out.println("La media aricmética de " + num1 + ", " + num2 + " y " + num3 + " es: " + media(num1, num2, num3));
                    break;
                case 6:
                    float pontent = potencia(num1, num2);
                    System.out.println("La potencia de " + num1 + " con exponente " + num2 + " es: " + potencia(num1, num2));
                    break;
            }
        } while (resp != 0);
    }

    static float suma(float num1, float num2) {
        float result = num1 + num2;
        return result;
    }

    static float resta(float num1, float num2) {
        float result = num1 - num2;
        return result;
    }

    static float multi(float num1, float num2) {
        float result = num1 * num2;
        return result;
    }

    static float div(float num1, float num2) {
        float result = num1 / num2;
        return result;
    }

    static float media(float num1, float num2, float num3) {
        float result = (num1 + num2 + num3) / 3;
        return result;
    }

    static float potencia(float num1, float num2) {
        float resultado = 1;
        for (float i = 0; i < num2; i++) {
            resultado = resultado * num1;
        }
        return resultado;
    }
}