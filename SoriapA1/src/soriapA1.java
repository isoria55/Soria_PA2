import java.util.Scanner;
public class soriapA1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userData;
		int a; // 1st digit
		int b; // 2nd digit
		int c; // 3rd digit
		int d; // 4th digit
		String userOption; // this is to see if they want to encrypt something or decrypt their data.
		
		System.out.println("Please type encrypt or decrypt:");
		userOption = scnr.next();
		if ((userOption.contains("encrypt")) || (userOption.contains("Encrypt"))) {
			System.out.println("Please enter your four digit data to encrypt:");
			
			// scan data
			userData = scnr.nextInt();
			
			// to get each digit respectively
			a = userData / 1000;
			b = (userData / 100) % 10;
			c = (userData % 100) / 10;
			d = userData % 10;
			
			System.out.println("Your encrypted data is: " + ((c + 7) % 10) + " " + ((d + 7) % 10) + " " + ((a + 7) % 10) + " " + ((b + 7) % 10));
		}
		else if ((userOption.contains("decrypt")) || (userOption.contains("Decrypt"))) {
			System.out.println("Please enter your four digit data to decrypt:");
			
			// scan data
			userData = scnr.nextInt();
			
			// to get each digit respectively
			a = userData / 1000;
			b = (userData / 100) % 10;
			c = (userData % 100) / 10;
			d = userData % 10;
			
			//this is to reverse the modulo because I noticed that 0-6 need to have + 10 and 7-9 should be left alone
			if ((a >= 0) && (a <= 6)) {
				a += 10;
			}
			if ((b >= 0) && (b <= 6)) {
				b += 10;
			}
			if ((c >= 0) && (c <= 6)) {
				c += 10;
			}
			if ((d >= 0) && (d <= 6)) {
				d += 10;
			}
			//print the result
			System.out.println("Your encrypted data is: " + (c - 7) + " " + (d - 7) + " " + (a - 7) + " " + (b - 7));
		}
		else {
			System.out.println("Please run again and type " + "\"encrypt\"" + " or " + "\"decrypt\"" + ". ");
		}
	}
}
