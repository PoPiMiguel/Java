import java.util.Scanner;

public class tareaFibonacci {
    public static void main(String[] args) {
        System.out.println("Dime el número n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibo = fibonacci (n);
        System.out.println(fibo);
    }

    static int fibonacci(int n) {
        int fibo;
        if ((n == 0) || (n == 1)) {
            fibo = 1;
        } else {
            fibo = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fibo;
    }

}