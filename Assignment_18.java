package excelassignments;
public class Assignment_18 {
	static void add()
	{
	int a=10;
	System.out.println(a);
	}
	void add(int a,int b)
	{
	 int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		int a=100;
		add();
		Assignment_18 ref1 = new Assignment_18();
		ref1.add(11,12);
	System.out.println(a);
	}
}