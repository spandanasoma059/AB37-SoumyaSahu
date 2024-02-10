package excelassignments;

public class Assignment_80 {

	public static void main(String[] args) {
		String name ="Soumya123456";
		char c1[]= name.toCharArray();
		//System.out.println(c1[1]);
		for(int i=0;i<=name.length()-1;i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			//boolean answer=Character.isdigit(c1[i]);
			//System.out.println(answer);
			if(answer==false)
			{
				System.out.println(i);
			}	
		}
	}
}

