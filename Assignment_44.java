package excelassignments;
class Parent1
{
	void add ()
	{
   int a =10; int b=20;
   int sum=a+b;
   System.out.println(sum);
	}
	static void sub ()
	{
   int a =10; int b=20;
   int sub=a-b;
   System.out.println(sub);
	}
	void mul ()
	{
   int a =10; int b=20;
   int mul=a*b;
   System.out.println(mul);
	}
}
public class Assignment_44 extends Parent1{

	public static void main(String[] args) {
		Assignment_44 s1 = new Assignment_44();
		s1.add();
		s1.mul();
		sub();
		s1.gk();
		}
	void gk ()
	{
   int a =10; int b=20;
   int gk=a*b;
   System.out.println(gk);
		}
	}

