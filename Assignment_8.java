package excelassignments;
public class Assignment_8 {
	Assignment_8 ()
	{
		System.out.println("Jai Shree Ram");
	}
	Assignment_8 (int a)
	{
		
		System.out.println(a);
	}
	Assignment_8 (int b, int a)
	{
		int sum = b+a;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_8 ref1= new Assignment_8();
		new Assignment_8(12);
		new Assignment_8(12,33);
	}
}
