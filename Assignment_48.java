package excelassignments;
class parentt{
	void add()	{
		int a =10; int b=20;
		int sum = a+b;
	}
	static void sub()
	{
		int a =10; int b=20;
		int sub = a-b;
	}
}
abstract class son2 extends parentt{	
	abstract void mul();
	abstract void div();	
}
public class Assignment_48 extends son2{

	public static void main(String[] args) {
		Assignment_48 ref1 = new Assignment_48();
		ref1.add();
		ref1.sub();
		ref1.mul();
		ref1.div();
		
	}
		void mul()
		{
			int a =10; int b=20;
			int sum1 = a+b;
			System.out.println(sum1);
		}
		void div()
		{
			int a =10; int b=20;
			int sub1 = a-b;
			System.out.println(sub1);
		}
		}

