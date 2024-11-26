/*
 * Student Name: Vanessa Alvine MOTUE
 * Due Date: 24/09/2024
 * Lab professor : Amal Ibrahim
 * Description: working class the program who prompt the user to enter numbers and convert them to 0 for negative numbers and square the positive numbers then display the converted numbers 
 * 				one per one on a new line
 */

public class ArrayModifier {
	
	private int[] values;
	private int number;

	public ArrayModifier() {
		values = null;
	}
	
	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}
	public void squarePositiveReplaceNegative() {	
		
		for (int i = 0; i < values.length; i++)
		{ 
			if (values[i] < 0)
			{
				values[i] = 0; 
				} 
			else
			{ 
				values[i] = values[i] * values[i];
			} 
		}
		
		
		
		/* TODO: implement this method so that all the elements of the
		 * array that are positive will be squared (to the power of 2)
		 * and all negative values will be replaced by 0
		 * e.g. The values: 4, -7, 3, -2 become: 16, 0, 9, 0
		 */
		
			
	}
}
