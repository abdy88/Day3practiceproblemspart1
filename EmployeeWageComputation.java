package day3PracticeProblemsPart1;

public class EmployeeWageComputation {
	
	
	public static void main(String[] args) {
	
	
	System.out.println("Welcome to Employee Wage Computation Program");
	
	checkattendance();
	
	}
	
	
	
	
				static void	checkattendance() {		
	
	
						int IS_FULL_TIME = 1;
						double empCheck =  Math.floor(Math.random()  *10) % 2  ;     
	
						System.out.println("Checking employee attendance..");
	
						if (empCheck == IS_FULL_TIME)
							System.out.println("Employee is present");
						else 
							System.out.println("Employee is absent");	
	
					}
	
	

}
