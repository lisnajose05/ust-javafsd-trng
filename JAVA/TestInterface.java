package optional.ust;
interface TestInterface1{
	public void square(int a);
	
	default void show() {
		System.out.println("default Method Executed");
	}
}
public class TestInterface implements TestInterface1 {

	 
		 public void square(int a) {
		System.out.println(a*a);

	}
		 public static void main(String args[]) {
			 TestInterface d=new TestInterface();
			 d.square(4);
			 d.show();
		 }

}
