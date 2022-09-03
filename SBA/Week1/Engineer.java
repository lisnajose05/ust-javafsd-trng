package com.ust;

 class Employee {
	int empid;
	String name;
	String designation;
	float salary;
	
	float salary(float a) {
		return a;
	}
	int salary(int a) {
		return a;
	}
	

	public  void display() {
				System.out.println("in super class");
			}
	}
 
	class Engineer extends Employee{
		public void display() {
			System.out.println("in sub class");
			super.display();
			
		}
	
	public static void main(String args[])
	{
		Engineer e=new Engineer();
		Employee e1=new Employee();
		System.out.println(e.salary(25000));
		System.out.println(e.salary(35000f));
		e.display();
		e1.display();
	}
	}
