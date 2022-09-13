package thread.ust;

public class Thread_Example implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Thread_Example();
	r.run();   //dont have start() in implements

	}
	
	public void run() {
		System.out.println("Thread Example");
		
	}

}
