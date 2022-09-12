package exce.ust;

public class Exception_generate2_code {
	public static void main(String args[]) {
		try {
			int divideByZero=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}
	}

}
