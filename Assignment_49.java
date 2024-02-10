package excelassignments;
interface Amazon
{
	void login();
	void logout();
	}
public class Assignment_49 implements Amazon{

	public static void main(String[] args) {
		Assignment_49 set1 = new Assignment_49(); 
		set1.login(); set1.logout();
	}
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");	
	}
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");	
	}
}
