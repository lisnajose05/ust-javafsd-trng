package day.ust;
class Animal_2{
	protected String type="animal";
}
class Dog_2 extends Animal_2{
	public String type="mammal";
	public void printType() {
		System.out.println(" I am a "+type);
		System.out.println("I am an "+super.type);
	}
}
public class Mammal_string {
	public static void main(String args[]) {
		Dog_2 dog1=new Dog_2();
		dog1.printType();
	}

}
