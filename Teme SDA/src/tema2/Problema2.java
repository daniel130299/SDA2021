package tema2;

import java.util.Scanner;

public class Problema2 {
	public static Scanner s;
	public static void main (String[]args) {
		s=new Scanner (System.in);
		System.out.println("Cati pacienti sunt?");
		int nr = s.nextInt();
		int i;
		double []v= new double[nr];
		for (i=0;i<nr;i++) {
			System.out.println("v(" + i + "]");
			v[i]=s.nextDouble();
		}
		System.out.print("Sunt temperaturi normale: ");
		for( i=0; i<nr; i++)
		{
			if(v[i]<37)
				System.out.println( "(" + v[i] + "," + i + ")" + ".");
			
		}
		System.out.println();
		System.out.print("Sunt temperaturi anormale: ");
		
		for( i=0;i<nr;i++)
		{
			if(v[i]>=37)
				System.out.print( "(" + v[i] + "," +i + ")" + ".");
		}
		}


}
