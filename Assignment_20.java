package excelassignments;
public class Assignment_20 {
	static int a;
	static int b;
	static void add()
	{
		a=10; b=10;
		int sum = a+b;
		System.out.println(sum);	
	}
	static void sub()
	{
		a=10; b=100;
		int sub = a-b;
		System.out.println(sub);	
	}	
	public static void main(String[] args) {	
		add();
		sub();
	}
}
