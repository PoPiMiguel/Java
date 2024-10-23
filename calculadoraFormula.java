import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class porrasPizarroMiguel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        do {
            System.out.println("Dime que quieres hacer: ");
            System.out.println("1- Area de un cuadrado");
            System.out.println("2- Area de un triángulo");
            System.out.println("3- Area de un círculo");
            System.out.println("4- Volumen de un cubo");
            System.out.println("5- Volumen de una pirámide de base cuadrada");
            System.out.println("6- Volumen de una esfera");
            System.out.println("7- Volumen de un cilindro");
            System.out.println("8- Volumen de un cono");
            System.out.println("0- Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Introduce el tamaño del lado del cuadrado en cm");
                    double ladoCuadrado = sc.nextDouble();
                    System.out.println("El area del cuadrado es: " + areaCuadrado(ladoCuadrado) + "cm2");
                    break;
                case 2:
                    System.out.println("Introduce el tamaño de la base del triángulo en cm");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Introduce la altura del triángulo en cm");
                    double alturaTriangulo = sc.nextDouble();
                    System.out.println("El area del triángulo es: " + areaTriangulo(baseTriangulo, alturaTriangulo) + "cm2");
                    break;
                case 3:
                    System.out.println("Introduce el radio del círculo en cm");
                    double radioCirculo = sc.nextDouble();
                    System.out.println("El area del círculo es: " + areaCirculo(radioCirculo) + "cm2");
                    break;
                case 4:
                    System.out.println("Introduce el lado del cubo en cm");
                    double ladoCubo = sc.nextDouble();
                    System.out.println("El volumen del cubo es: " + volumenCubo(ladoCubo) + "cm3");
                    break;
                case 5:
                    System.out.println("Introduce el tamaño del lado de la base del tetraedro en cm");
                    double baseTetra = sc.nextDouble();
                    System.out.println("Introduce la altura del tetraedro en cm");
                    double alturaTetra = sc.nextDouble();
                    System.out.println("El volumen del tetraedro es: " + volumenTetraedro(baseTetra, alturaTetra) + "cm3");
                    break;
                case 6:
                    System.out.println("Introduce el tamaño del radio de la esfera en cm");
                    double radioEsfera = sc.nextDouble();
                    System.out.println("El volumen de la esfera es: " + volumenEsfera(radioEsfera) + "cm3");
                    break;
                case 7:
                    System.out.println("Introduce el tamaño del radio de la base del cilindro en cm");
                    double radioBase = sc.nextDouble();
                    System.out.println("Introduce la altura del cilindro en cm");
                    double alturaCilindro = sc.nextDouble();
                    System.out.println("El volumen del cilindro es: " + volumenCilindro(radioBase, alturaCilindro) + "cm3");
                    break;
                case 8:
                    System.out.println("Introduce el tamaño del radio de la base del cono en cm");
                    double radioBaseCono = sc.nextDouble();
                    System.out.println("Introduce la altura del cilindro en cm");
                    double alturaCono = sc.nextDouble();
                    System.out.println("El volumen del tetraedro es: " + volumenCono(radioBaseCono, alturaCono) + "cm3");
                    break;
            }
        } while (resp != 0);
    }

    //Función 1 area del cuadrado
    public static double areaCuadrado(double ladoCuadrado) {
        double areaCua = ladoCuadrado * ladoCuadrado;
        return areaCua;
    }

    //Función 2 area del triángulo
    public static double areaTriangulo(double baseTriangulo, double alturaTriangulo) {
        double areaTri = (baseTriangulo * alturaTriangulo) / 2;
        return areaTri;
    }

    //Función 3 area del círculo
    public static double areaCirculo(double radioCirculo) {
        double areaCir = Math.PI * (radioCirculo * radioCirculo);
        return areaCir;
    }

    //Función 4 volumen del cubo
    public static double volumenCubo(double ladoCuadrado) {
        double volCubo = ladoCuadrado * areaCuadrado(ladoCuadrado);
        return volCubo;
    }

    //Función 5 volumen de un tetraedro
    public static double volumenTetraedro(double ladoCuadrado, double alturaTetra) {
        double volTetra = (areaCuadrado(ladoCuadrado) * alturaTetra) / 3;
        return volTetra;
    }

    //Función 6 volumen de una esfera
    public static double volumenEsfera(double radioEsfera) {
        double volEsfera = (4 * Math.PI * (radioEsfera * radioEsfera * radioEsfera)) / 3;
        return volEsfera;
    }

    //Función 7 volumen de Cilindro
    public static double volumenCilindro(double radioCirculo, double alturaCilindro) {
        double volCilindro = areaCirculo(radioCirculo) * alturaCilindro;
        return volCilindro;
    }

    //Función 8 volumen de un cono
    public static double volumenCono(double radioBaseCono, double alturaCono) {
        double volCono = (Math.PI * (radioBaseCono * radioBaseCono) * alturaCono) / 3;
        return volCono;
    }
}