package tema4;

import java.util.*;

public class Main {

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int i;
	        int elem = 10;
	        int[] v = new int[elem];
	        for (i = 0; i < elem; i++) {
	            v[i] = new Random().nextInt(255);
	        }

	        System.out.print("Introdu pozitia dorita : ");
	        int z = s.nextInt();
	        System.out.print("Adauga un numar : ");
	        int a = s.nextInt(); 
	        System.out.println("Sirul initial: ");
	        for (i = 0; i < elem; i++) {
	            System.out.print(v[i] + " ");
	        }
	        elem = elem +1;
	        v = Arrays.copyOf(v, v.length + 1); 
	        
	        
	       
	        for (i = 0; i < elem; i++) {
	            if (z == i) {
	                for(int j = elem -1 ; j > i ; j--) {
	                    v[j] = v[j-1];
	                }
	                v[i] = a;
	                break;
	            }
	                
	    
	        }
	        System.out.println();
	        System.out.println("Sirul final: ");
	        for (i = 0; i < elem; i++) {
	            System.out.print(v[i] + " ");
	        }
	    }
	}


