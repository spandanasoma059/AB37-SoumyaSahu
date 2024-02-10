package excelassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_61 {

	public static void main(String[] args) {
		try
	{
		Scanner s1 = new Scanner(System.in);
		//int c=1/0;
		int a = s1.nextInt();
	}
	
	catch (ArithmeticException a1)
	{System.out.println("int cannot store infinity,so please do not worry i have handled it");
}
		catch (InputMismatchException a3)
		{
			System.out.println("int cannot store infinity,so please do not worry i hav");
			}	
}
}