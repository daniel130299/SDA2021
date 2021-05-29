package tema4;
import java.util.*;

public class Problema3 {
	
	public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] v = {1,4,7,8,9,23,55,78,90,100};
        int n = x.nextInt();

        boolean b;
        int a = 0;
        int stanga = 0;
        int dreapta = v.length -1 ;
        int mijloc = (stanga + dreapta)/2 ;
        while(stanga <= dreapta) {
            if(v[mijloc] < n) {
                stanga = mijloc + 1;
            }
            if(v[mijloc] > n) {
                dreapta = mijloc -1;
            }
            mijloc = (stanga+dreapta)/2;
            if(v[mijloc] == n) {
                a = 1;
                break;
            }
        }

        if(a == 1) {
            b = true;
        }else {
            b = false;
        }


        System.out.print(b);

    }


}