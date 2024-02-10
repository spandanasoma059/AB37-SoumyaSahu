package excelassignments;
class Parents1
{
	void add ()
	{
	int a =10;int b=89;
	int sum = a+b;
	System.out.println(sum);
	}
	}
class son extends Parents1
{
	void sub ()
	{
	int a =10;int b=89;
	int sub = a-b;
	System.out.println(sub);
	}
	}
class daughter extends Parents1
{
	void mul ()
	{
	int a =10;int b=89;
	int mul = a*b;
	System.out.println(mul);
	}
	}
public class Assignment_46 extends Parents1 {

	public static void main(String[] args) {
		Assignment_46 ref1 = new Assignment_46();
		ref1.add();
		System.out.println("Soumya");
	}
}
