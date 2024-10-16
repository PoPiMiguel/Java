import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Opcion ind
        /* for (int i = 1; i <= n; i++){
            for (int j = 1;j <= n-i;j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (i*2)-1; l++){
                System.out.print("*");
            }
            System.out.println();
        } */
        //Opcion dep
        for (int i = 0; i < n; i++) {
            int espacios = n;
            for (int j = 0; j < i; j++) {
                while (espacios > i) {
                    System.out.print(" ");
                    espacios--;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}