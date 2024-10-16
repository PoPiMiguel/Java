import java.util.Scanner;

public class pascal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hasta que fila desea ver el triangulo de pascal: ");
            int nfilas=sc.nextInt();

            System.out.println(" ");
            int[] a= new int[1];
            for(int i=1;i<=nfilas;i++){
                int[] x = new int[i];
                for(int j=0;j<i;j++){
                    if(j==0 || j==(i-1)){
                        x[j]=1;
                    }else{
                        x[j]=a[j]+a[j-1];
                    }
                    System.out.print(x[j] + " ");
                }
                a=x;
                System.out.println();
            }
        }

    }
