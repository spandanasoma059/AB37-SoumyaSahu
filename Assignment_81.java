package excelassignments;

public class Assignment_81 {

	public static void main(String[] args) {
		String name1 = "Rahul123";
		char c1 []= name1.toCharArray();
		int alpha=0; int digits=0;
		
		for(int i=0;i<=name1.length()-1;i++)
		{
	
			if (c1 [i]>= 'a' && c1 [i]<= 'z' || c1[i] >= 'A' && c1[i] <= 'Z' )
			{
			  alpha++;
			
			}
			else if (c1 [i]>= '0' && c1 [i]<= '9' )
			{
				digits++;
			}
			
		}
		System.out.println("number of alphabets = "+alpha);
		System.out.println("number of digits = "+digits);
	}

}
