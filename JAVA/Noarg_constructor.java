package day.ust;
class Animal_3{
	Animal_3(){
		System.out.println("i am an animal");
	}
}
class Dog_3 extends Animal_3{
	Dog_3(){
		super();
		System.out.println("I am a dog");
	}
	
}

public class Noarg_constructor {
	public static void main(String args[]) {
		Dog_3 dog1=new Dog_3();
	}

}
