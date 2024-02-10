package excelassignments;

import java.util.Scanner;

public class Assignment_41 {

	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		int a = a1.nextInt();
		int b = a1.nextInt();
		switch(1)
		{
		case 1: 
		int sum = a+b;
		System.out.println(sum);
		case 2: 
			int sub = a-b;
			System.out.println(sub);
		case 3: 
			int mul = a-b;
			System.out.println(mul);
		case 4: 
			double div = a/b;
			System.out.println(div);
	}
	}
}
