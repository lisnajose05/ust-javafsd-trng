package day.ust;
class Default{
	int val_a;
	int val_b;
	Default(){
		val_a=10;
		val_b=20;
	}
	Default get() {
		return this;
	}
	void display()
	{
		System.out.println("val_a="+"val_b="+val_b);
		
	}
}
public class This_display {
	public static void main(String args[]) {
		Default object=new Default();
		object.get().display();
	}

}
