package excelassignments;
public class Assignment_21 {
	static void plus(int a, double b)
	{
		double plus=a+b;
		System.out.println(plus);	
	}
	public static void main(String[] args) 
	{
		System.out.println("All is well");
		plus(9,2.00);
		Assignment_21 a1 = new Assignment_21();
		a1.minus();
		a1.trail();
	}
	void minus()
	{
		int v=9;
		v=12-v;
		System.out.println(v);		
	}
	void trail()	{
		int a=22; int b=33;
		int mul=a*b;
		if(a<=b)		{
			System.out.println(mul);
		}
		else		{
			System.out.println("Calculation went wrong");
		}
	}
}
