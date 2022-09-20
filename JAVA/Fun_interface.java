package lambda.ust;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}
public class Fun_interface {
	public static void main(String args[]) {
		MyInterface ref;
		ref=()->3.1415;
		System.out.println("Value of Pi="+ref.getPiValue());
	}

}
