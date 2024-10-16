import java.util.Scanner;

public class numMayor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 3 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int numMayor = mayor(num1, num2, num3);

        System.out.println("El número mayor es " + numMayor);
    }

    static int mayor( int num1, int num2){
        int numMayor = (num1 > num2)? num1: num2;
        return numMayor;
    }
    //Funcion sobrecargada
    static int mayor (int num1, int num2, int num3){
        //hallamos el numero mayor entre num1 y num2
        int numMayorEj = mayor(num1, num2);
        int numMayor = mayor(numMayorEj, num3);
        return numMayor;
    }
}