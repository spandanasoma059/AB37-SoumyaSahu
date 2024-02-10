package excelassignments;
interface Amazona
{
	void Order();
}
interface Myntraa extends Amazona
{
		void Payment();
		}
abstract class Ajio implements Myntraa
{
	abstract void Ajio1 ();
	}
public class Assignment_55 extends Ajio{

	public static void main(String[] args) {
		Assignment_55 set5 = new Assignment_55();
		set5.Ajio1();set5.Order();set5.Payment();
	}
	public void Payment() {
		System.out.println("payment");		
	}
	public void Order() {
		System.out.println("Order");	
	}
	void Ajio1() {
		System.out.println("Ajio1");	
	}
}
