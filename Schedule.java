// Rishikaa Harish Kumar
//08-27-2024
// Schedule.java
/* the program will print my school schedule
 * Working on:
 * new line \n.
 */ 

public class Schedule
{
	public static void main(String[] args)
	{//Allman style means to put the brace below the header
		System.out.print("\n\n\n"); //Always include 3 blank lines(3BLs)
		
		// This is the print statement for the Title of my schedule
		String course = new String("Course Schedule For:");
		String name = new String("Rishikaa Harish Kumar");
		System.out.println(Format.center(course,50));
		System.out.println(Format.center(name,50));
		System.out.println("\n");
		
		// This is for period 1
		System.out.printf("%-25d%25s\n",1,"Java");
		
		// This is for period 2
		System.out.printf("%-25d%25s\n",2,"Algebra 2/Trig");
		
		// This is for period 3
		System.out.printf("%-25d%25s\n",3,"Free");
		
		// This is for period 4
		System.out.printf("%-25d%25s\n",4,"PE 9");
		
		// This is for period 5
		String period5= new String("Lit/Writ");
		System.out.print("5"+Format.right(period5,50));
		System.out.print("\n");
		
		// This is for period 6
		String period6 = new String("Spanish 2");
		System.out.print("6"+Format.right(period6,50));
		System.out.print("\n");
		
		// This is for period 7
		String period7 = new String("Biology");
		System.out.print("7"+Format.right(period7,50));
		System.out.print("\n");
		
		// This is for the bill amount
		String bill = new String("Outstanding bill:");
		double amount = 34.56789;
		System.out.print(bill+amount);
		
		// To make the output more clear
		System.out.print("\n\n\n");
		}
}
