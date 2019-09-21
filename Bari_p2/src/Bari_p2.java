// Farhan Bari
// COP 3330
// Assignment 2 Problem 2

import java.util.Scanner;

public class Bari_p2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float weightInPounds, heightInInches, bmiUS;
		float heightInMeters, weightInKG, bmiUK;
		
		int choice;
		
		System.out.println("Please enter 1 if you would like to enter your weight/height in pounds/inches.\nPlease enter 2 if you would like to enter your weight/height in kilograms/meters.");
		choice = input.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter your weight in pounds: ");
			weightInPounds = input.nextFloat();
			System.out.println("Enter your height in inches: ");
			heightInInches = input.nextFloat();
			bmiUS = (weightInPounds * 703) / (heightInInches * heightInInches);
			System.out.printf("Your body mass index (BMI) is %.1f\n\n", bmiUS);
			
			System.out.println ("BMI VALUES");
	        System.out.println ("Underweight    =  <18.5");
	        System.out.println ("Normal weight  =   18.5-24.9");
	        System.out.println ("Overweight     =   25-29.9");
	        System.out.println ("Obesity        =   BMI of 30 or greater");
			break;
			
		case 2:
			System.out.println("Enter your weight in kilograms: ");
			weightInKG = input.nextFloat();
			System.out.println("Enter your height in meters: ");
			heightInMeters = input.nextFloat();
			bmiUK = (weightInKG) / (heightInMeters * heightInMeters);
			System.out.printf("Your body mass index (BMI) is %.1f\n\n", bmiUK);
			
			System.out.println ("BMI Categories:");
	        System.out.println ("Underweight    =  <18.5");
	        System.out.println ("Normal weight  =   18.5-24.9");
	        System.out.println ("Overweight     =   25-29.9");
	        System.out.println ("Obesity        =   BMI of 30 or greater");
			break;
			
		default:
			System.out.println("Invalid input");				
		}
		
		return;
	}

}
