package tema5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

        DetaliiStudenti student1 = new DetaliiStudenti("Andrei", "Daniel", 6, 9);
        DetaliiStudenti student2 = new DetaliiStudenti("Amariei", "Rares", 10, 10);
        DetaliiStudenti student3 = new DetaliiStudenti("Bidilica", "Razvan", 10, 10);
        DetaliiStudenti student4 = new DetaliiStudenti("Dumitru", "Stelian", 5.5, 6.5);
        DetaliiStudenti student5 = new DetaliiStudenti("Will", "Smith", 9, 8.5);
        DetaliiStudenti student6 = new DetaliiStudenti("Bogdan", "Daniel", 4, 5.5);
        DetaliiStudenti student7 = new DetaliiStudenti("Trandafir", "Teodora", 5, 5);
        DetaliiStudenti student8 = new DetaliiStudenti("Alexandru", "Ilie", 6, 7.5);
        DetaliiStudenti student9 = new DetaliiStudenti("Filip", "Florin", 7, 6);
        DetaliiStudenti student10 = new DetaliiStudenti("Tanase", "Catalin", 8, 8);

      
        HashMap<String, DetaliiStudenti> studentList_HashMap = new HashMap<>();

        studentList_HashMap.put("011", student1);
        studentList_HashMap.put("022", student2);
        studentList_HashMap.put("033", student3);
        studentList_HashMap.put("064", student4);
        studentList_HashMap.put("075", student5);
        studentList_HashMap.put("086", student6);
        studentList_HashMap.put("097", student7);
        studentList_HashMap.put("048", student8);
        studentList_HashMap.put("039", student9);
        studentList_HashMap.put("0510", student10);

       
        LinkedHashMap<String, DetaliiStudenti> studentList_LinkedHashMap = new LinkedHashMap<>();

        studentList_LinkedHashMap.put("011", student1);
        studentList_LinkedHashMap.put("022", student2);
        studentList_LinkedHashMap.put("033", student3);
        studentList_LinkedHashMap.put("064", student4);
        studentList_LinkedHashMap.put("075", student5);
        studentList_LinkedHashMap.put("086", student6);
        studentList_LinkedHashMap.put("097", student7);
        studentList_LinkedHashMap.put("048", student8);
        studentList_LinkedHashMap.put("039", student9);
        studentList_LinkedHashMap.put("0510", student10);

      
        System.out.println("Introdu CNP-ul:");
        Scanner scan = new Scanner(System.in);
        String CNP = scan.nextLine();
       

 
        System.out.println(studentList_HashMap.get(CNP));

        for (String key : studentList_HashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();

     
        System.out.println(studentList_LinkedHashMap.get(CNP));

        for (String key : studentList_LinkedHashMap.keySet()) {
            System.out.println(key);
        }

        scan.close();

    }
}


