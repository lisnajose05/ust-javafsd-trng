package exer.ust;
abstract class Language{
	public void display() {
		System.out.println("This is java programming");
	}
}

class Abstract_class extends Language {
	public static void main(String args[]) {
		Abstract_class a1=new Abstract_class();
		a1.display();
	}

}
