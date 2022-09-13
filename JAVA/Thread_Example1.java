package thread.ust;

public class Thread_Example1 implements Runnable{
	public void run() {
		
	}
	public static void main(String args[]) {
		Thread thread1=new Thread();
		
		try {
			thread1.sleep(1000);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		thread1.setPriority(7);
		int priority=thread1.getPriority();
		System.out.println(priority);
		thread1.start();
		System.out.println("Thread Running");
	}

}
