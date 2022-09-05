package day.ust;

 class FinalDemo_1 {
	public final void dispay() {
		System.out.println("This is a final method");
	}

}
class Finalmethod extends FinalDemo_1{
	public final void display() {
		System.out.println("The final method is overridden");
	}
	public static void main(String args[]){
		Finalmethod obj=new Finalmethod();
		obj.display();
	}
}