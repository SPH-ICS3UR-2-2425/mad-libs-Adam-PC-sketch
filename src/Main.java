import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author:Adam Dagher 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("Give me a name");
		String name = in.nextLine();
		System.out.println("Give me a number");
		
		int num1=in.nextInt();
        System.out.println("One day, "+name+" wrote a Mad Lib in class!");
	System.out.println("Yesterday there was a soccer game");
	//flush
	in.nextLine();
	System.out.println("");
	}
}
