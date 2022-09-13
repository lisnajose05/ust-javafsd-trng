package enu.ust;
enum Signal{
	RED(5),ORANGE(10),GREEN(15);
	private int x;
	private Signal(int x){
		this.x=x;
	}
	
	int getIndex() {
		return x;
	}


}
public class Enum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Signal s=Signal.GREEN;
System.out.println(Signal.GREEN.getIndex());
System.out.println(Signal.RED.getIndex());
System.out.println("ordinal:  "+s.ordinal());
System.out.println(s.name());
System.out.println(s.valueOf("RED"));
	}

}
