package excelassignments;
public class Assignment_10 {
		static void plus(int a, double b)
		{
			double plus=a+b;
			System.out.println(plus);		
		}
		static void sub(double a, int b)
		{
			double sub=a+b;
			System.out.println(sub);		
		}
		public static void main(String[] args) 
		{
			System.out.println("All is well");
			plus(9,2.00);
		    sub(8.09,8);
		    Assignment_10 a1 = new Assignment_10();
			a1.mul(6,98,9);
			a1.div(9,5);
		}
			
		void div(int g,int h)
		{
			double div=g/h;
			System.out.println(div);
			
		}
		void mul(int a, int b, int c)
		{
			int mul = a*b*c;
				System.out.println(mul);
			}
		}
