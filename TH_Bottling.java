/**
 * Program:			TH_Bottling.java
 * Date:			Sep. 20, 2019
 * Author:			T. Haworth
 * Description:		A sample solution to PRACTICE in-class assignment 1.
 * 					Calculates the number of bottles required to bottle a batch of home brew.
 */

import java.util.*;

public class TH_Bottling
{

	public static void main(String[] args)
	{

		// Create a Scanner object to read keyboard inputs
		Scanner input = new Scanner(System.in);

		// 1. Prints an explanation of the purpose of the program as shown in the screenshot below.
		System.out.println("Home Brew Botting Program\n");
		
		// 2. Asks the user to input the total volume in the batch of home brew in litres (L) and assigns this to
		// an appropriate variable.
		System.out.print("Enter the total amount of home brew in L: ");
		double batchSizeL = input.nextDouble();
		
		// 3. Asks the user to input the bottle size in millilitres (mL) and assigns this to an appropriate variable.
		System.out.print("Enter the bottle size in millilitres: ");
		int bottleSizeMl = input.nextInt();
		
		// 4. Asks the user to input a description of the brew being bottled and assigns this to an appropriate
		// variable.
		System.out.print("Enter a description for your home brew: ");
		input.nextLine(); // flush buffer
		String description = input.nextLine();
		
		// 5. Declares a numeric constant called ML_PER_L and assigns it the value 1000.
		final int ML_PER_L = 1000;
		
		// 6. Calculates the batch size in mL by multiplying the batch size in L by the constant ML_PER_L and
		// assigns this to an appropriate variable.
		int batchSizeMl = (int)(batchSizeL * ML_PER_L);
		
		// 7. Calculates the number of bottles required using the following formula:
		// number_of_bottles = batch_size_in_ml / bottle_size_in_ml
		int numBottles = batchSizeMl / bottleSizeMl;
		
		// 8. Displays the exact number of bottles required assuming that only completely full bottles will be
		// counted/filled. We don’t want decimal places here so truncate the answer before displaying it.
		System.out.println("\nYou will need " + numBottles + " bottles for your batch of " + description + ".");
		
		// 9. After the bottles are filled there will very likely be some extra home brew leftover (some amount
		// less than one full bottle). Calculate and display this amount in mL.
		int leftover = batchSizeMl % bottleSizeMl;
		//int leftover = batchSizeMl - (numBottles * bottleSizeMl);
		System.out.println("There will be " + leftover + " mL of " + description + " left over, unbottled.");
		
		// Close the Scanner object
		input.close();
	}

}
