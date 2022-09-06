package inter.ust;
 class Classconstructor {
	int a;
	int b;
	Classconstructor(){
		this(10,20);
		System.out.println("Inside default constructor\n ");
	}
	Classconstructor(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String args[]) {
		Classconstructor object=new Classconstructor();
	}

}
