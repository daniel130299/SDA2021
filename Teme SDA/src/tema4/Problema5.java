package tema4;
import java.util.Scanner;
import java.util.Random;

public class Problema5 {

    

    private static void printare(int[][] matrice, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
    
   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        int x = 3;
        int y = 3;

        System.out.println("Introdu numarul de linii: ");
        n = scan.nextInt();
        System.out.println("Introdu numarul de coloane: ");
        m = scan.nextInt();
        System.out.println();

        int[][] matrice = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               matrice[i][j] = new Random().nextInt(255);
            }
        }
        System.out.println("Matricea initiala: ");
        printare(matrice, n, m);
       
        
        for (int i = 0; i < n; i = i + y) {
            for (int j = 0; j < m; j = j + x) {
                int maximx = Math.min(x, m - j);
                int maximy = Math.min(y, n - i);
                int sum = 0;
                for (int k = 0; k < maximy; k++) {
                    for (int l = 0; l < maximx; l++) {
                        sum += matrice[i + k][j + l];
                    }
                }
                int medie = (int) sum / (maximx * maximy);
                for (int k = 0; k < maximy; k++) {
                    for (int l = 0; l < maximx; l++) {
                        matrice[i + k][j + l] = medie;
                    }
                }

            }
        }
        System.out.println();
        System.out.println("Matricea modificata:");
        printare(matrice, n, m);
    }
}