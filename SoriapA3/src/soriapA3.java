import java.util.Scanner;
public class soriapA3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String [] topics = new String [5];
		String [] smashCharacters = new String [5]; // I made another String for the topics to print them out easier
;		int [] [] responses = new int [5][10];
		char userSurvey;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int userResponse;
		int i;
		int j;
		
		//Initialize my variables
		j = 0;
		topics[0] = "From 1 - 10, how would you rate Ness overall as a character in Smash?";
		topics[1] = "From 1 - 10, how would you rate Corrin overall as a character in Smash?";
		topics[2] = "From 1 - 10, how would you rate Joker overall as a character in Smash?";
		topics[3] = "From 1 - 10, how would you rate Donkey Kong overall as a character in Smash?";
		topics[4] = "From 1 - 10, how would you rate Mega Man overall as a character in Smash?";
		smashCharacters[0] = "Ness";
		smashCharacters[1] = "Corrin";
		smashCharacters[2] = "Joker";
		smashCharacters[3] = "Donkey Kong";
		smashCharacters[4] = "Mega Man";
		
		//prompt the user to take the poll
		System.out.println("Welcome! Would you like to take the poll on Super Smash Bros. Ultimate?\n Please enter 'y' or 'n':");
		userSurvey = scnr.next().charAt(0);
		while ((userSurvey == 'y') || (userSurvey == 'Y')) {
			for (i = 0; i < 5; i++) {
				System.out.println(topics[i]);
				userResponse = scnr.nextInt();
				if (i == 0) {
					a += userResponse;
				}
				else if (i == 1) {
					b += userResponse;
				}
				else if (i == 2) {
					c += userResponse;
				}
				else if (i == 3) {
					d += userResponse;
				}
				else if (i == 4) {
					e += userResponse;
				}
				
				j = userResponse - 1;
				responses[i][j]++;
			}
			f++;
			//this way if multiple people take the poll the poll can keep going until 'n' is typed
			System.out.println("Would another person like to take the poll?\n Please enter 'y' or 'n': ");
			userSurvey = scnr.next().charAt(0);
		}
		System.out.println("            1 2 3 4 5 6 7 8 9 10  Avg"); //the numbers above the table
		
		for (i = 0; i < 5; i++) {
			System.out.print(smashCharacters[i] + " ");
			//responseAverage = 0; //that way it takes the average of each row
			
			/*so i created this if else below to make the output look more organized
			i scaled them all to donkey kong cause his string was the longest*/
			if (i == 0) { //ness
				System.out.print("       ");
			}
			else if (i == 1) { //corrin
				System.out.print("     ");
			}
			else if (i == 2) { //joker
				System.out.print("      ");
			}
			else if (i == 4) { //mega man
				System.out.print("   ");
			}
				for(j = 0; j < 10; j++) {

					System.out.print(responses[i][j]+ " ");
					//sprinkled this if statement in to new line after one row was done
					//if (j == 9) {
						//System.out.println();
				//}
			}
				if (i == 0) {
					System.out.println("  " + (((double)a) / ((double)f)));
				}
				else if (i == 1) {
					System.out.println("  " + (((double)b) / ((double)f)));
				}
				else if (i == 2) {
					System.out.println("  " + (((double)c) / ((double)f)));
				}
				else if (i == 3) {
					System.out.println("  " + (((double)d) / ((double)f)));
				}
				else if (i == 4) {
					System.out.println("  " + (((double)e) / ((double)f)));
				}
		}
		//highest pointed issue
		if ((a > b) && (a > c) && (a > d) && (a > e)) {
			System.out.println("Ness is the highest pointed issue.");
		}
		else if ((b > a) && (b > c) && (b > d) && (b > e)) {
			System.out.println("Corrin is the highest pointed issue.");
		}
		else if ((c > b) && (c > a) && (c > d) && (c > e)) {
			System.out.println("Joker is the highest pointed issue.");
		}
		else if ((d > b) && (d > c) && (d > a) && (d > e)) {
			System.out.println("Donkey Kong is the highest pointed issue.");
		}
		else if ((e > b) && (e > c) && (e > d) && (e > a)) {
			System.out.println("Mega Man is the highest pointed issue.");
		}
		//lowest pointed issue
		if ((a < b) && (a < c) && (a < d) && (a < e)) {
			System.out.println("Ness is the lowest pointed issue.");
		}
		else if ((b < a) && (b < c) && (b < d) && (b < e)) {
			System.out.println("Corrin is the lowest pointed issue.");
		}
		else if ((c < b) && (c < a) && (c < d) && (c < e)) {
			System.out.println("Joker is the lowest pointed issue.");
		}
		else if ((d < b) && (d < c) && (d < a) && (d < e)) {
			System.out.println("Donkey Kong is the lowest pointed issue.");
		}
		else if ((e < b) && (e < c) && (e < d) && (e < a)) {
			System.out.println("Mega Man is the lowest pointed issue");
		}
	}
}