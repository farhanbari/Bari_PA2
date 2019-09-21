// Farhan Bari
// COP 3330
// Assignment 2 Problem 3

import java.util.Scanner;
public class Bari_p3 {

	public static void main(String[] args) {
		String[] topics = {"Call of Duty", "Battlefield", "Fortnite", "Rainbow Six Siege", "Apex Lengends"};
		int[][] responses = new int [5][10];
		int response;
		int totalResponses = 0;
		int totalUsers = 0;
		boolean notFinished = true;
		
		Scanner input = new Scanner(System.in);
		
		while (notFinished)
		{
			totalUsers +=1;
			System.out.println("Please rate on a scale of 1-10 how to feel about the following games/franchises.");
			for (int r = 0; r<5; r++)
			{
				System.out.println(topics[r]);
				response = input.nextInt();
				responses[r][response-1] += 1;
				
			}
			
			System.out.println("Would you like to input from another user? (y-n)");
			
			if (input.equals("n")) {
				notFinished = false;

			}
			else {
				notFinished=true;
			}
			
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			for (int n = 0; n<5; n++);
					{
						System.out.print(topics[n] + " ");
						for (int c = 0; c < 10; c++); {
							System.out.print(responses[n][c] + " ");
						}
					}
			
		}
		
		
		
	}

}
