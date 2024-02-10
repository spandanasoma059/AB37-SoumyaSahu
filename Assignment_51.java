package excelassignments;
interface Flipkart
{
	void gmail();
	}
abstract class Meesho implements Flipkart
{
	void password() {
		System.out.println("password");
	}
	abstract void email();
	}
public class Assignment_51 extends Meesho {

	public static void main(String[] args) {
		Assignment_51 set2 = new Assignment_51();
		set2.email(); set2.gmail(); set2.password();
	}
	public void gmail() {
		System.out.println("gmail");
	}
	void email() {
		System.out.println("email");
	}
}
