package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		NissanTiida x = new NissanTiida();
		Scanner keyboard = new Scanner(System.in);
		int i;
		System.out.println("Please enter a number : ");
		int n = keyboard.nextInt();
		
		for(i=0;i<n;i++)
		{
			x.tiida();
			System.out.printf("%n");
		}
		
		keyboard.close();
	}

}
