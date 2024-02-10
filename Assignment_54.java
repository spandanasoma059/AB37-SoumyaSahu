package excelassignments;
interface Amaz
{
	void Order();
}
interface Mynt
{
		void Payment();
		}
abstract class Aji implements Amaz,Mynt
{
	abstract void Aji ();
	}
public class Assignment_54 extends Aji{

	public static void main(String[] args) {
		Assignment_54 set6 = new Assignment_54();
		set6.Aji();set6.Order();set6.Payment();
	}
	public void Payment() {
		System.out.println("payment");		
	}
	public void Order() {
		System.out.println("Order");	
	}
	void Aji() {
		System.out.println("Aji");
	}
}

