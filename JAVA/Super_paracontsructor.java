package day.ust;
class Animal_4{
	Animal_4(){
		System.out.println("i am an animal");
	}
	Animal_4(String type){
		System.out.println("Type:"+type);
		
	}
}
class Dog_4 extends Animal_4{
	Dog_4(){
		super("Animal_4");
		System.out.println("I am a Dog");

	}
}
public class Super_paracontsructor {
	public static void main(String args[]) {
		Dog_4 dog1=new Dog_4();
	}

}
