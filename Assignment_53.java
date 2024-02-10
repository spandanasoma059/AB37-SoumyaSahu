package excelassignments;
interface Amazon11
{
	void Order();
}
interface Myntra1
{
		void Payment();
		}
interface Amazon111
{
	void Placed();
}
interface Myntra11
{
		void Hold();
		}
public class Assignment_53 implements Amazon11,Myntra1,Amazon111,Myntra11{
	public static void main(String[] args) {
		Assignment_53 set4 = new Assignment_53();
		set4.Order();set4.Payment();set4.Placed();set4.Hold();
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
	public void Order() {
		System.out.println("order");	
	}

}
