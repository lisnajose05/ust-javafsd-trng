package exer.ust;
abstract class abstract1{
	int age;
	String name;
	String address;
	void display() {
		System.out.println(age+" "+address+" "+name);
	}
	int show() {
		return 0;
	}
	abstract float calculate(); 
	abstract void check();
		
	}
abstract public class AbstractEg extends abstract1{
		float calculate() {
			return 0f;
		}
		void check() {
}
}

