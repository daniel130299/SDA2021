package tema4;
import java.util.*;

public class Problema2 {
	public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int i;
        int elem = 10;
        int[] v = new int[elem];
        for(i = 0 ; i < elem ; i++) {
            v[i] = new Random().nextInt(255);
        }
        System.out.println("Sirul initial: ");
        for (i = 0; i < elem; i++) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println();
        System.out.println("Pozitia dorita: ");
        int z = x.nextInt();
        
        
        for(i = 0 ; i < elem ; i++) {
            if(z == i) {
                for(int j = i ; j < elem - 1 ; j++) {
                    v[j] = v[j+1];
                }
            }
        }
        System.out.println("Sirul final: ");
        for (i =0; i < elem; i++) {
            if(i < elem-1){
            System.out.print(v[i] + " ");
            }else {
                System.out.println("null");
            }
        }
    }
}

