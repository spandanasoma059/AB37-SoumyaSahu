package excelassignments;

import java.util.Arrays;

public class Assignment_65 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0]=3;
		num[1]=8;
		num[2]=9;
		num[3]=8;
		int rn1[]=new int[4];
		for(int i=0; i<4;i++)
		{
			rn1[i]=num[i];
		}
		System.out.println("num Array is now stored in rnl :" + Arrays.toString(rn1));
	}

}
