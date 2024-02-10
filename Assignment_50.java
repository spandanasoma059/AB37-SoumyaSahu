package excelassignments;
interface Paytm
{
	void login1();
	void auth();
	}
interface Razorpay extends Paytm
{
	void logout();
	void signin();
	}
public class Assignment_50 implements Razorpay{

	public static void main(String[] args) {
		Assignment_50 ref1 = new Assignment_50();
		ref1.auth(); ref1.login1(); ref1.logout();ref1.signin();
	}

	@Override
	public void login1() {
		System.out.println("login1");
	}

	@Override
	public void auth() {
		System.out.println("auth");
	}

	@Override
	public void logout() {
		System.out.println("logout");
	}

	@Override
	public void signin() {
		System.out.println("signin");
	}

}
