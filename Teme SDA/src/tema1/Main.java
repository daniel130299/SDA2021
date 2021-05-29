package tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n1, n2 ;
		int max , min;
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduceti primul numar: ");
		n1 = Integer.parseInt(x.readLine());
		System.out.print("Introduceti al doilea numar: ");
		n2 = Integer.parseInt(x.readLine());
	
		int sum , dif , pr , dis ;
		double avg = (double)(n1+n2)/2 ;
		sum = n1 + n2 ;
		dif = n1 - n2 ;
		pr = n1*n2 ;
		if(n1 > n2) {
			dis = n1 - n2;
			dif = n1 - n2;
			max = n1;
			min = n2;
		}
		else {
			dis = n2 - n1;
			max = n2;
			min = n1;
		}
	
		System.out.println("Afiseaza suma: " + sum);
		System.out.println("Afiseaza diferenta: " + dif);
		System.out.println("Afiseaza produsul: " + pr);
		System.out.println("Afiseaza media: " + avg);
		System.out.println("Afiseaza distanta: " + dis);
		System.out.println("Maximul este: " + max);
	    System.out.println("Minimul este: " + min);
	}

}
