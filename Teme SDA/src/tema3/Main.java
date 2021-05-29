package tema3;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException {

		Scanner x = new Scanner(System.in);

		List<Shape> shape = new ArrayList<>();
		try {
			shape.add(new Circle("#000000", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Square("#000000", 8, 8));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Rectangle("#FF0000", 7, 7, 15));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.print("Selectare mod: (a) sau (m)");
		String y = x.nextLine();
		switch (y) {
		case "a":
			for (Shape s : shape) {
				System.out.println("Detalii :" + s.getName() + "," + s.getArea() + "cm patrati," + s.getBorderWidth() + " pixeli,"
						+ s.getHexFillColor());
				s.draw();
				System.out.println();
			}
			break;
		case "m":
			System.out.println("Dreptunghi(r) / Cerc(c) / Patrat(s)");
			String z = x.nextLine();
			switch (z) {
			case "r":
				for (Shape s : shape) {
					if (s.getName() == "Dreptunghi") {
						System.out.println(s.getName() + "," + s.getArea() + "cm patrati," + s.getBorderWidth() + " pixeli,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;
			case "c":

				for (Shape s : shape) {
					if (s.getName() == "Cerc") {
						System.out.println(s.getName() + "," + s.getArea() + "cm patrati," + s.getBorderWidth() + " pixeli,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			case "s":

				for (Shape s : shape) {
					if (s.getName() == "Patrat") {
						System.out.println(s.getName() + "," + s.getArea() + "cm patrati," + s.getBorderWidth() + " pixeli,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			}
		}
		
		List<String> colors = new ArrayList<>();
        for(Shape s: shape) {
            colors.add(s.getHexFillColor());
        }
        System.out.println("Lista culorilor: " + colors);

        Set<String> mySet = new HashSet<String>(colors); 
        for(String s: mySet){
            System.out.println(s + " " + Collections.frequency(colors,s));
	}

}
}
