package excelassignments;

public class Assignment_57 {
	
	public void add()
	{
		System.out.println("This is addition");
	}
	private void sub()
	{
		System.out.println("This is subtraction");
	}
	protected void mul()
	{
		System.out.println("This is multiplication");
	}
	void div()
	{
		System.out.println("This is division");
	}
	public static void main(String[] args) 
	{
		Assignment_57 ref1 = new Assignment_57();
		ref1.add();
		ref1.div();
		ref1.mul();
		ref1.sub();
	}

}
