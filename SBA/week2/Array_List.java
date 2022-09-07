package sba.ust;
import java.util.ArrayList;
import java.util.Iterator;
public class Array_List {
	public static void main(String args[]) {
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1001);
		numbers.add(1002);
		numbers.add(1003);
		numbers.add(1004);
		numbers.add(1005);
		numbers.add(1006);
		numbers.add(1007);
		numbers.add(1008);
		numbers.add(1009);
		numbers.add(1010);
		numbers.add(1011);
		numbers.add(1012);
		numbers.add(1013);
		numbers.add(1014);
		numbers.add(1015);
		numbers.add(1016);
		numbers.add(1017);
		numbers.add(1018);
		numbers.add(1019);
		numbers.add(1020);
		ArrayList<String>name=new ArrayList<>();
		name.add("Anu");
		name.add("Manu");
		name.add("vinu");
		name.add("Nahla");
		name.add("Ajwed");
		name.add("Jeeva");
		name.add("Rita");
		name.add("Akshay");
		name.add("Glory");
		name.add("Appu");
		name.add("Ash");
		name.add("Chandu");
		name.add("Aleena");
		name.add("vineetha");
		name.add("mathew");
		name.add("Alan");
		name.add("Achu");
		name.add("Sinu");
		name.add("Rani");
		name.add("kannan");
		ArrayList<Integer>age=new ArrayList<>();
		age.add(26);
		age.add(27);
		age.add(26);
		age.add(30);
		age.add(25);
		age.add(26);
		age.add(32);
		age.add(33);
		age.add(27);
		age.add(28);
		age.add(26);
		age.add(29);
		age.add(23);
		age.add(27);
		age.add(29);
		age.add(29);
		age.add(26);
		age.add(24);
		age.add(26);
		age.add(29);
		
		Iterator<Integer>iterate=numbers.iterator();
		Iterator<String>iterate1=name.iterator();
		Iterator<Integer>iterate2=age.iterator();
		
		while(iterate.hasNext()) {
			System.out.println("Employee Details:");
			for(int i=1;i<=20;i++) {
				System.out.println("Employee "+i+" : ");
			System.out.println(iterate.next()+" "+iterate1.next()+" "+iterate2.next()+"\n");
			
		}

	}
	}
}
