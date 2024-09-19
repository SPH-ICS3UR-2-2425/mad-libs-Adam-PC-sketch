import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program Author:Adam Dagher Class: ICS3U Date: Sept. 16, 2024 Make a
		 * program that asks for 10 inputs reads them into variables, and then prints
		 * out a story Make sure to include Strings, ints, and doubles!
		 */

		Scanner in = new Scanner(System.in);
		

		
		System.out.println("Yesterday there was a soccer game");
		// flush
		in.nextLine();
	
		System.out.println("Give me a name: ");
		String person1 = in.nextLine();
		System.out.println("Give ma a day of the month");
		String dayofthemonth = in.nextLine();
		System.out.println("Give me a location");
		String location = in.nextLine();
		System.out.println("Give me a name: ");
		String person2 = in.nextLine();
		System.out.println("Give me your favourite number");
		String num1 = in.nextLine();
		System.out.println("Give me a phrase that you say when you are happy");
		String phrase = in.nextLine();
		System.out.println("Give me a decimal: ");
		String dec = in.nextLine();
		System.out.println("On " + dayofthemonth + ", " + person1 + " and " + person2 + " were at " + location
				+ " when a stranger slipped. "
				+ " "+person1+" looked at "+person2+" and they helped the stranger in about "+num1+" and "+dec+" seconds! "
				+ " The stranger looks at "+person1+" and "+person2+" and says "+phrase+" "
			
				);
	}
}