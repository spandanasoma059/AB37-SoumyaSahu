package excelassignments;
public class Assignment_9
{
	Assignment_9 (double a, int b)
	{	
		double mul = a*b;
		System.out.println(mul);
	}	
	Assignment_9 (int a, double b)
	{
		double div = a/b;
		System.out.println(div);
	}	
	Assignment_9 (int b, int a)
	{
		int sub = b-a;
		System.out.println(sub);
	}
	Assignment_9() 
	 {
		System.out.println("Understood");
	}
	public static void main(String[] args) {
		
		Assignment_9 ref1= new Assignment_9();
		new Assignment_9(2.3,3);
		new Assignment_9(100,4.5);
		new Assignment_9(12,33);
		}
}
