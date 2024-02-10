package excelassignments;
class Parent10
{
	void add ()
	{
	int a =10;int b=89;
	int sum = a+b;
	System.out.println(sum);
	}
	}
class Parent11 extends Parent10
{
	void sub ()
	{
	int a =10;int b=89;
	int sub = a-b;
	System.out.println(sub);
	}
	}
public class Assignment_45 extends Parent11{

	public static void main(String[] args) {
		Assignment_45 ref1 = new Assignment_45();
		ref1.add();
		ref1.sub();
		System.out.println("Soumya");
	}
}
