/*
 * Prompt the user to enter an integer (scanner)
 * Display a table of squares and cubes from 1 to the value entered.
 * Ask if the user wants to continue
 */

import java.util.Scanner;


public class TableofPowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		String letter = "y";
			
		while(letter.equalsIgnoreCase("y")) {
			
			System.out.println("Find out what a range of numbers are squared and cubed");
			System.out.println("Please enter a number: ");
			num = scan.nextInt();
			
			if(num > 0) {
				String table = "";
				table += "Number\t square\t cube\n";
				table += "======\t ======\t ======\t\n";
					
				for (int i = 1; i <= num; i++){
					int square = (i*i);
					int cubed = (i*i*i);
					table += i + "\t" + square + "\t" + cubed + "\n";
				}
			
			System.out.println(table);
			System.out.println("");
		
			}
		System.out.println("Would you like to continue? select y/n");
		letter = scan.next();	
		}
		
		System.out.println("Goodbye");
				
				
				

		
			}
		
			
		}
		
		
		
		

	


