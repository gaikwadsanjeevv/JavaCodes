package oops1;

public class InstanceVariableDemo {
	
	String stuNames;
	public static void main(String[] args) {
		
		InstanceVariableDemo std1 = new InstanceVariableDemo();
		InstanceVariableDemo std2 = new InstanceVariableDemo();
		InstanceVariableDemo std3 = new InstanceVariableDemo();
		InstanceVariableDemo std4 = new InstanceVariableDemo();
		
		std1.stuNames = "Sanjeev";
		std2.stuNames = "Raju";
		std3.stuNames = "Seema";
		std4.stuNames = "Kalyan";
		
		System.out.println("The names of students in UCM is as follows: " );
		System.out.println("Student 1 : "+std1.stuNames);
		System.out.println("Student 2 : "+std2.stuNames);
		System.out.println("Student 3 : "+std3.stuNames);
		System.out.println("Student 4 : "+std4.stuNames);
		
		
		
	}

}
