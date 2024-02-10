package excelassignments;
class Parent
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
public class Assignment_43 extends Parent {
	public static void main(String[] args) {
		Assignment_43 s1 = new Assignment_43();
		s1.add();
		s1.mul();
		sub();
			}
}
