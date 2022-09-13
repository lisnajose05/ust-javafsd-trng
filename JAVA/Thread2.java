package thread.ust;


	public class Thread2 extends Thread{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Thread2 t3=new Thread2();
			try {
				System.out.println("Hi");
			t3.sleep(5000);
			System.out.println("slept");
			}
	catch(Exception ex) {
		ex.printStackTrace();
	}
		}

	}


