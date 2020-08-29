//UseCase 3=>Add Part time and wage

class EmpWageComputation {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int wagePerHour = 20;
	
	public static void main(String[] args){
	
		int workHour = 0;

		int check = (int)(Math.random()*3)+1;

		if(check == 1){
		
			workHour = 8;
		}
		else if(check == 2){
		
			workHour = 4;
		}
		else{
		
			workHour = 0;
		}
		int dailyWage = workHour * wagePerHour;
		System.out.println("Daily wage is:"+dailyWage);
	}
}

