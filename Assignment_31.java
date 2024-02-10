package excelassignments;

public class Assignment_31 {
	final static double pi =3.14;
	
	static void areaofcircle()
	{
		int r=14;
		double area = pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args) {
		int r=7;
		double area = pi*r*r;
		double circumference=2*pi*r;
		System.out.println(area);
		areaofcircle();
		System.out.println("c :"+circumference);

	}

}
