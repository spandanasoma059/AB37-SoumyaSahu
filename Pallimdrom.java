package excelassignments;


public class Pallimdrom {

	public static void main(String[] args) {
		
		String name = "Soumya";
		String outut = "";
		for (int i=name.length()-1;i>=0;i--)
		{
			// System.out.println("Soumya name is a pallindrome");
			outut = outut+name.charAt(i);
		}
		if (outut.equals(name) )
		{
			System.out.println("Soumya name is pallindrome");
		}
	else 
	{
		System.out.println("name is not Pallindrome");
	}
	}

}
