package inner.ust;
//Anonymous class example
abstract class Animal{
	abstract void sound();
}
public class NameLessClass {
public static void main(String args[]) {
	Animal a=new Animal() {
	void sound() {
		System.out.println("Animal Sound");
	}
	};
	a.sound();
	
}
}
