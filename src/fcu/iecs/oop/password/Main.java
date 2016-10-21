package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PasswordEncorder password = new PasswordEncorder();
		
		Scanner keyboard = new Scanner(System.in);
		String string1,string2,string3 = "exit";
		
		int num = 1;
		while(num == 1)
		{
			System.out.println("Please enter a password : ");
			string1 = keyboard.next();
			
			if(string1.equals(string3)){
				break;
			}
			
			string2 = password.encoder(string1);
			System.out.printf("%s%n",string2);	
		}
		keyboard.close();
	}
}
