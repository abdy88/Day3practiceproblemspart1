package day3PracticeProblemsPart1;

public class EmployeeWageComputation {
	
	
	static double empCheck =  Math.floor(Math.random()  *10) % 2  ;    
	
	
	
	public static void main(String[] args) {
	
	
				System.out.println("Welcome to Employee Wage Computation Program");
	
				checkattendanceUC1();
				dailyemployeewageUC2();
				AddparttimeemployeeandwageUC3();
				solvingusingswitchcase();
	
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
							System.out.println("Employee present hence Daily employee wage is =  " + salary);
						}
					
					else
						{
							int salary=0;
							System.out.println("Employee absent hence Daily employee wage is =  " + salary);
						
						
						}
					
				}
			
			    static void AddparttimeemployeeandwageUC3() {
			    	
			    	int salary=0;
				
					byte isPresent=1;
					byte isPartTime=2;
					byte isFulltime=3;
					
//					double empCheck = Math.floor(Math.random()  *10) % 2  ; 
					
					double partOrFulltime =  Math.floor(Math.random()  *4);
					
					System.out.println("Checking again for another day  if Part time or full time or absent ");
					
//					System.out.println(empCheck);
//					System.out.println(partOrFulltime);
					
					
					if (empCheck==isPresent && partOrFulltime==isFulltime)
					{	
						int empRatePerHr=20;
						int empHrs=10;
						salary= empRatePerHr*empHrs;
						System.out.println("Employee worked Full time hence Daily employee wage is =  " + salary);
					}
					
					else if (empCheck==isPresent && partOrFulltime==isPartTime)
					{
						
						int empRatePerHr=20;
						int empHrs=8;
						salary= empRatePerHr*empHrs;
						System.out.println("Employee worked Part time hence Daily employee wage is =  " + salary);
						
					}
					
					else {
						salary=0;
						System.out.println("Employee absent hence Daily employee wage is =  " + salary);
					
						
					}
					
				}
			
			    
			    
			    	static void solvingusingswitchcase()
			    	{
			    		int salary=0;
			    		final byte isPartTime=1;
			    		final byte isFulltime=2;
			    		int partOrFulltime =  (int)Math.floor(Math.random()  *3);
			    		
			    		System.out.println("Calculating daily wage using switch case");
//			    		System.out.println(partOrFulltime);
			    		
			    		
			    		switch (partOrFulltime) {
			    		
			    			case isFulltime:
			    				int empRatePerHr=20;
			    				int empHrs=10;
			    				salary= empRatePerHr*empHrs;
			    				System.out.println("Employee worked Full time hence Daily employee wage is =  " + salary);
			    				break;
			    				
			    			case isPartTime:
			    				empRatePerHr=20;
			    				empHrs=8;
			    				salary= empRatePerHr*empHrs;
			    				System.out.println("Employee worked Part time hence Daily employee wage is =  " + salary);
			    				break;
			    		    
			    		    case 0:
			    		    	salary=0;
			    				System.out.println("Employee absent hence Daily employee wage is =  " + salary);
			    				break;
			    		        
			    		    default:
			    		    	System.out.println("NO EMPLOYEE DATA");
			    		   
			    			}
			    	
			    	
			    	
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    	}
			
			
			
								

}
