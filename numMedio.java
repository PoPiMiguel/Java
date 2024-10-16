import java.util.Scanner;

public class numMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        eco(num1, num2);
    }
    static void eco(int num1, int num2){
        for (int i = num1+1; i < num2; i++) {
            System.out.print(i + " ");
        }
    }
}