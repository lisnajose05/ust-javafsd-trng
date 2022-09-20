package lambda.ust;

import org.apache.poi.util.SystemOutLogger;

public class InstanceMethodReference2 {
public void printMsg() {
	System.out.println("Hello,this is intstance method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new InstanceMethodReference2()::printMsg);
		t2.start();

	}

}
