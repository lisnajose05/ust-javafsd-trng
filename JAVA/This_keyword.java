package inter.ust;

 class This_keyword {
	 int a;
	 int b;
	 
	 This_keyword(){
		 a=10;
		 b=20;
	 }
	 This_keyword get() {
		 return this;
	 }
	 void display() {
		 System.out.println("a="+a+"b="+b);
	 }
	 public static void main(String args[]) {
		 This_keyword object=new This_keyword();
		 object.get().display();
	 }
}
