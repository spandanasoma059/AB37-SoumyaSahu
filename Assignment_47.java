package excelassignments;
class Parents12
{
	void add ()
	{
	int a =10;int b=900;
	int sum = a+b;
	System.out.println(sum);
	}
	}
class son1 extends Parents12
{
	void sub ()
	{
	int a =10;int b=89;
	int sub = a-b;
	System.out.println(sub);
	}
	}
class daughter1 extends Parents12
{
	void mul ()
	{
	int a =10;int b=89;
	int mul = a*b;
	System.out.println(mul);
	}
	}
public class Assignment_47 extends Parents12 {

	public static void main(String[] args) {
		Assignment_47 ref1 = new Assignment_47();
		ref1.add();
		System.out.println("Soumya");
	}
}


