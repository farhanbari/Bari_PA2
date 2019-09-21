// Farhan Bari
// COP 3330
// Assignmnent 2 Problem 1

import java.util.Scanner;

public class bari_p1 {

	public static void main(String[] args) {
		getValue();

	}
	
	public static int getValue()
	{
		int encryptL = 0, stringSizeE = 0;
		String encryptS;
		
		Scanner n = new Scanner(System.in);
		while (stringSizeE !=4)
		{
			System.out.println("Enter a four digit number to encrypt");
			encryptS = n.nextLine();
			stringSizeE = encryptS.length();
			
			if (stringSizeE == 4)
			{
				encryptL = Integer.parseInt(encryptS);
				
			}
		}
		encrypt(encryptL);
		
		int decryptL = 0, stringSizeD = 0;
		String decryptS;
		Scanner m = new Scanner(System.in);
		while (stringSizeD !=4)
		{
			System.out.println("Enter a four digit encrypted number to decrypt");
			decryptS = m.nextLine();
			stringSizeD = decryptS.length();
			
			if (stringSizeD == 4)
			{
				decryptL = Integer.parseInt(decryptS);
			}
		}
		decrypt(decryptL);

		return 0;
		
	}
	
	public static int encrypt(int num)
	{
		int a, b, c, d;
		a = num / 1000;
		b = num / 100 % 10;
		c = num / 10 % 10;
		d = num % 10;
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		System.out.print("Encrypted: ");
		System.out.println(c * 1000 + d * 100 + a * 10 + b);
		return (c * 1000 + d * 100 + a * 10 + b);
		
	}
	
	public static int decrypt(int num)
	{		
		int a, b, c, d;
		a = num / 1000;
		b = num / 100 % 10;
		c = num / 10 % 10;
		d = num % 10;
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		
		System.out.print("Decrypted: ");
		System.out.println(c * 1000 + d * 100 + a * 10 + b);
		return (c * 1000 + d * 100 + a * 10 + b);
		
	}

}
