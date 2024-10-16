import java.util.Scanner;

public class numMayor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        mayor(num1, num2);
        System.out.println("El numero mayor es: "+ mayor(num1, num2));

    }
    static int mayor(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
}