package excelassignments;

public class Assignment_75 {

	public static void main(String[] args) {
		int num[] = {23,43,41,346}; // second syntax of Array
		int rollnotocheck = 41;
		
		for(int i=0;i<=3;i++)
		{
			if(rollnotocheck==num[i])
			{
				System.out.println("Number is present:"+num[i]);
			}
			else
			{
				System.out.println("NUmber is not present");
			}
		}
	}

}
