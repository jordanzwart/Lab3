/*
 * Prompt the user to enter an integer (scanner)
 * Display a table of squares and cubes from 1 to the value entered.
 * Ask if the user wants to continue
 */

import java.util.Scanner;


public class TableofPowers {

	public static void main(String[] args) {
		//adds scanner
		Scanner scan = new Scanner(System.in);
		
		int num;
		String letter = "y";
		//while the loop equals either y or Y it will loop through to entering an input by user	
		while(letter.equalsIgnoreCase("y")) {
			
			System.out.println("Find out what a range of numbers are squared and cubed");
			System.out.println("Please enter a number: ");
			num = scan.nextInt();
		// if the input is bigger than 0 it will start the code and start creating the table 	
			if(num > 0) {
				String table = "";
				table += "Number\t Square\t Cube\n";
				table += "======\t ======\t ======\t\n";
		//using a for loop we need to find the squared and cubed answers of the range of numbers from 1 to the user input
		//for example if we use 5 we will print the square and cubed answers of the numbers 1-5	and place them in table	
				for (int i = 1; i <= num; i++){
					int square = (i*i);
					int cubed = (i*i*i);
					table += i + "\t" + square + "\t" + cubed + "\n";
				}
		//we now print the table as we got our final outcome	
			System.out.println(table);
			System.out.println("");
		
		
			}
		//we ask user if they want to continue accepting answers y or Y to continue or n to say goodbye
		System.out.println("Would you like to continue? select y/n");
		letter = scan.next();	
		}
		
		System.out.println("Goodbye");
				
				

		
			}
		
			
		}
		
		
		
		

	


