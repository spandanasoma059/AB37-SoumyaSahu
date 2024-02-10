package excelassignments;
interface Amazon1
{
	void Order();
}
interface Myntra
{
		void Payment();
		}
public class Assignment_52 implements Amazon1,Myntra {

	public static void main(String[] args) {
		Assignment_52 set3 = new Assignment_52();
		set3.Order();set3.Payment();
	}

	public void Payment() {
		System.out.println("payment");
	}

	public void Order() {
		System.out.println("order");
	}

}
