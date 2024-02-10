package excelassignments;

import java.util.Arrays;

public class Assignment_64 {

	public static void main(String[] args) {
		String name[] = new String[3];
		name[0] = "Soumya";
		name[1] = "Soma";
		name[2] = "Chotu";
		System.out.println(Arrays.toString(name));// to print the strings
		Arrays.sort(name);//sorting
		System.out.println(Arrays.toString(name));
	}

}
