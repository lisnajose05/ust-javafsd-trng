package enu.ust;

enum Size_1 {

SMALL,MEDIUM,LARGE,EXTRALARGE
}
class Test{
	Size pizzaSize;
	public Test(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I Ordered a medium size pizza");
			break;
		default:
			System.out.println("I Ordered a medium size pizza");
			break;
			
		}
	}
}
public class Enum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(Size.MEDIUM);
		t1.orderPizza();

	}

}
