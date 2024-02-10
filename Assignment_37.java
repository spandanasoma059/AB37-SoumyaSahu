package excelassignments;
import java.util.Scanner;
public class Assignment_37 {
	Scanner ref1 = new Scanner(System.in);
	int a = ref1.nextInt();
	int b = ref1.nextInt();
	public static void main(String[] args) {
		Assignment_37 S1 = new Assignment_37();
		S1.sum();
		S1.sub();
		S1.mul();
		S1.div();
	}
	void sum() {
		int sum = a+b;
		System.out.println(sum);
	}
	void sub() {
		int sub = a-b;
		System.out.println(sub);
	}
	void mul() {
		int mul = a*b;
		System.out.println(mul);
	}
	void div() {
		double div = a/b;
		System.out.println(div);
	}
}
