package tema2;
import java.util.*;
import java.io.*;

public class Problema1 {
	 public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         System.out.println("Introduceti tipul dorit:");
         String a = x.nextLine();
         a = a.toLowerCase();
         System.out.println("Pentru tip1");
         System.out.println(tip1(a));
         System.out.println("Pentru tip2");
         System.out.println(tip2(a));
         System.out.println("Pentru tip3");
         System.out.println(tip3(a));
 }



public static int tip1(String name) {
 if(name.equals("oras"))
     return 50;
 else if(name.equals("zona rezidentiala"))
     return 30;
 else if(name.equals("drum express"))
     return 100;
 else if(name.equals("autostrada"))
     return 130;
 else return 0;
}

public static int tip2(String name) {
 if(name.equals("oras"))
     return 50;
 else 
 {
	 if(name.equals("zona rezidentiala"))
     return 30;
	 else
	 {
		 if(name.equals("drum express"))
		 return 100;
		 else 
		 {
			 if(name.equals("autostrada"))
             return 130;
		 }
	 }
 }
 return 0;
} 
public static int tip3(String name) {

 switch(name) {
 case "oras":
     return 50;

 case "drum express":
     return 100;

 case "autostrada":
     return 130;

 case "zona rezidentiala":
     return 30;
 }
 return 0;
}

}
	

