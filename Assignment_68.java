package excelassignments;

public class Assignment_68 {

	public static void main(String[] args) {
		String M1 = "Books";
		String M2 = "Software";
		String M3 = M2.concat(M1);
		
		char ch[] = M3.toCharArray();
		for(int i=0; i<=M3.length()-1;i++)
		{
			System.out.println(M3.charAt(i));
		}
	}
}
