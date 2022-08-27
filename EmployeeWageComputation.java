package day3PracticeProblemsPart1;

public class EmployeeWageComputation {
	
	
	static double empCheck =  Math.floor(Math.random()  *10) % 2  ;    
	
	
	
	public static void main(String[] args) {
	
	
				System.out.println("Welcome to Employee Wage Computation Program");
	
				checkattendanceUC1();
				dailyemployeewageUC2();
				
	
		}
	
	
			static void	checkattendanceUC1() {		
	
	
						int IS_FULL_TIME = 1;
//						double empCheck =  Math.floor(Math.random()  *10) % 2  ;     
	
						System.out.println("Checking employee attendance..");
	
						if (empCheck == IS_FULL_TIME)
							System.out.println("Employee is present");
						else 
							System.out.println("Employee is absent");	
	
					}
				
	
			static void dailyemployeewageUC2()
				{
					
					int isPresent=1;
//					double empCheck =  Math.floor(Math.random()  *10) % 2  ; 
					
					System.out.println("Checking daily employee wage");
					
					if (empCheck==isPresent)
						{
							int empRatePerHr=20;
							int empHrs=8;
							int salary= empRatePerHr*empHrs;
							System.out.println("Daily employee wage is =  " + salary);
						}
					
					else
						{
							int salary=0;
							System.out.println("Daily employee wage is =  " + salary);
						
						
						}
					
				}
									

}
