package sba.ust;

abstract class Employee{
	
	abstract void calculateSalary(); 
	abstract void fetchDepartment();
}


class Engineer extends Employee {
	public void calculateSalary() {
		System.out.println("Salary of an Engineer");
	}
	public void fetchDepartment() {
		System.out.println("Department of an Engineer");
	}
}
class Doctor extends Employee{
	public void calculateSalary(){
		System.out.println("salary of a doctor");
	}
	public void fetchDepartment() {
		System.out.println("Department of a Doctor");
	
	}
 
public static void main(String args[]) {
	Engineer e=new Engineer();
	e.calculateSalary();
	e.fetchDepartment();
	Doctor d=new Doctor();
	d.calculateSalary();
	d.fetchDepartment();
	



}

}
