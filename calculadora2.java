import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        double angulo;
        do {
            System.out.println("Dime que quieres hacer");
            System.out.println("1- Suma de primos");
            System.out.println("2- Seno, coseno y tangente");
            System.out.println("3- Distancia euclidea");
            System.out.println("0- Salir");
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Introduce un número para calcular la suma de los primeros n números:");
                    int n = sc.nextInt();
                    System.out.println("La suma de los primeros " + n + " números es: " + sumaPrimerosNumeros(n));
                    break;
                case 2:
                    System.out.print("Introduce un ángulo de (0...360°): ");
                    angulo = sc.nextDouble();
                    trigonometria(angulo);
                    break;
                case 3:
                    System.out.println("Introduce las coordenadas del primer punto (x1 y y1):");
                    double x1 = sc.nextDouble();
                    double y1 = sc.nextDouble();

                    System.out.println("Introduce las coordenadas del segundo punto (x2 y y2):");
                    double x2 = sc.nextDouble();
                    double y2 = sc.nextDouble();

                    System.out.println("La distancia euclidiana entre (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: "
                            + distanciaEuclidea(x1, y1, x2, y2));
                    break;
            }
        } while (resp != 0);


    }

    public static int sumaPrimerosNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static void trigonometria(double angulo) { 
        double radianes = Math.toRadians(angulo); // Convertimos el ángulo a radianes
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = Math.tan(radianes);

        System.out.println("Seno de " + angulo + " grados: " + seno);
        System.out.println("Coseno de " + angulo + " grados: " + coseno);
        System.out.println("Tangente de " + angulo + " grados: " + tangente);
    }

    public static double distanciaEuclidea(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }

}
