package thread.ust;

public class Thread4 implements Runnable {
	Thread t;
	Thread4(String str){
		t=new Thread(this,str);
		t.start();
	}
	public void run() {
		//boolean lt;
		for(int i=0;i<5;i++) {
			if((i%5)==0) {
				System.out.println(Thread.currentThread().getName()+"yielding control....");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"has finished executing");
	}
	public static void main(String args[]) {
		new Thread4("Thread 1");
		new Thread4("Thread 2");
		new Thread4("Thread 3");
	}

}
