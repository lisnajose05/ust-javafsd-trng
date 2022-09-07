package collection.ust;

public class Generics1<T> {
	T t;
	public T get() {
		return t;
	}
	
	
	public void set(T t) {
		this.t=t;
	}
	public static void main(String args[]) {
		Generics1<String> g=new Generics1<>();
		g.set("Hi");
		System.out.println(g.get());
		
		Generics1<Integer> gi=new Generics1<>();
		gi.set(100);
		System.out.println(gi.get());
		
		
	}

}
