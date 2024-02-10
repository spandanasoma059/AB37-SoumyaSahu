package excelassignments;

public class Assignment_66 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0]=3;
		num[1]=8;
		num[2]=90;
		num[3]=8333;
		int sum =0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		double avg= sum/num.length;
		double reminder = sum%num.length;
		System.out.println(avg);
		System.out.println(reminder);
	}
}
