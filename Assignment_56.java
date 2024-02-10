package excelassignments;
interface Mynt1
{
		void Payment();
		}
interface Amaz1
{
	void Placed();
}
interface Mynt2
{
		void Hold();
		}
public class Assignment_56 implements Mynt1,Amaz1,Mynt2{
	public static void main(String[] args) {
		Assignment_56 set4 = new Assignment_56();
		set4.Payment();set4.Placed();set4.Hold();
	}
	public void Hold() {
		System.out.println("hold");
	}
	public void Placed() {
		System.out.println("placed");	
	}
	public void Payment() {
		System.out.println("payment");
	}
}

