package lambda.ust;
interface Sayable_1{
	void say();
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello,this is static method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable_1 sayable=MethodReference::saySomething;
		sayable.say();

	}

}
