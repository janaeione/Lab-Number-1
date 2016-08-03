
import java.util.Scanner;

public class Lab1 {

public static void main (String args []) {
		//starting my string/ block code to define what I am doing.

			System.out.println("Welcome to the Area and Perimeter Calculator");
	// display a welcome message
		
		double width = 0.0;
		double length = 0.0;
		double area = 0.0;
		double perimeter = 0.0;
		
		Scanner sc = new Scanner(System.in);
		String response;
		
		
	do{
			System.out.println("Enter Length:");
			length = sc.nextDouble();
		
			System.out.println("Enter Width:");
			width = sc.nextDouble();
		
			area=length * width;
			perimeter = 2 * (length + width);
		
			System.out.println("Area:" + area);
			System.out.println("Perimeter:" + perimeter);
		
			System.out.print("Continue? (y/n):");
			response = sc.next();
	
		} while (response.equalsIgnoreCase ("y"));
sc.close();
		
		
		
	}
}
