package sba.ust;

interface Emp{
	
	abstract void calculateSalary(); 
	abstract void fetchDepartment();
}


class Eng implements Emp {
	public void calculateSalary() {
		System.out.println("Salary of an Engineer");
	}
	public void fetchDepartment() {
		System.out.println("Department of an Engineer");
	}
}
class Doc_tor implements Emp{
	public void calculateSalary(){
		System.out.println("salary of a doctor");
	}
	public void fetchDepartment() {
		System.out.println("Department of a Doctor");
	
	}
 
public static void main(String args[]) {
	Eng e=new Eng();
	e.calculateSalary();
	e.fetchDepartment();
	Doctor d=new Doctor();
	d.calculateSalary();
	d.fetchDepartment();
	
}

}

