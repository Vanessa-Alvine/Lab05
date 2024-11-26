/*
 * Student Name: Vanessa Alvine MOTUE
 * Due Date: 24/09/2024
 * Lab professor : Amal Ibrahim
 * Description: main class for the program who prompt the user to enter numbers and convert them to 0 for negative numbers and square the positive numbers then display the converted numbers 
 * 				one per one on a new line
 */
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbersToCollect;
		int[] numbers;
		int count = 0;
		ArrayModifier arrayModifier;
		
		System.out.println("How many numbers would you like to collect?");
		numbersToCollect = input.nextInt();
		input.nextLine();
		numbers = new int[numbersToCollect];
		
		while (count < numbersToCollect) {
			System.out.printf("Enter value #%d: ", count + 1);
			int number = input.nextInt();
			input.nextLine();
			numbers[count] = number;
			++count;
		}
		
		arrayModifier = new ArrayModifier();
		arrayModifier.setValues(numbers);
		
		arrayModifier.squarePositiveReplaceNegative();
		
		System.out.println("The modifier array is:");
		// TODO use a loop to print the modified array, one element per line.
		
		int[] modifiedArray = arrayModifier.getValues();
		
		for (int i = 0; i < modifiedArray.length; i++)
			
		{ 
			System.out.println(modifiedArray[i]); 
		
		}
		// TODO print your name below
		
		System.out.println("Program modified by Vanessa Alvine MOTUE");
		input.close();
	}
}
