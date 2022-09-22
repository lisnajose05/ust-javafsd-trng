package optional.ust;



interface Sayable1{
	 default void say() {
		 System.out.println("Hello,this is deafult method");
	 }
	 void sayMore(String msg);
	 static void sayLouder(String msg) {
		 System.out.println(msg);
	 }
 }
public class DefaultMethods1 implements Sayable {
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethods1 dm=new DefaultMethods1();
		dm.say();
		dm.sayMore("Work is worship");
		Sayable1.sayLouder("Helloooo..");

	}

}
