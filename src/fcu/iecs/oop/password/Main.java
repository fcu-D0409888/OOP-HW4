package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PasswordEncorder password = new PasswordEncorder();
		
		Scanner keyboard = new Scanner(System.in);
		String string1,string2,string3 = "exit";

		do
		{
			System.out.println("Please enter a password : ");
			string1 = keyboard.next();
		
			string2 = password.encoder(string1);
			System.out.printf("%s%n",string2);
			
		}while(string2.equals(string3));
		
		
		keyboard.close();
	}
}
