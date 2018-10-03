package measureRectangle;

/*
 * Avleen Kaur Period 7
 */
import java.util.Scanner;

public class measureRectangle {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the height of your rectangle:");
		double height = in.nextDouble();
		
		System.out.print("Please enter the width of your rectangle:");
		double width = in.nextDouble();
		//should put  .nextLine()
		double area = height*width;
		double perimeter = height + height + width + width;
		double diagonal = Math.hypot(height, width);
		
		System.out.printf("%-10s %10.2f", "Area:", area);
		System.out.println("");
		System.out.printf("%-10s %10.2f", "Perimeter:",perimeter);
		System.out.println("");
		System.out.printf("%-10s %10.2f", "Diagonal:",diagonal);
		
	}

}
