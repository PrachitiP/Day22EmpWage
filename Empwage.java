//UseCase 5=>Calculate wage for month
 
class Empwage {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int wagePerHour = 20;
	public static final int workDayPerMonth = 20;
	
	public static void main(String[] args){
	
		int workHour = 0;
		int monthWage = 0;

		for(int i=1;i<=workDayPerMonth;i++){
		
			int check = (int)(Math.random()*3)+1;

			switch(check){
				case isFullTime:
					workHour = 8;
					break;

				case isPartTime:
					workHour = 4;
					break;
				default:
					workHour = 0;
					break;
			}
			int dailyWage = workHour * wagePerHour;
			monthWage = monthWage + dailyWage;
			System.out.println("wage of day "+i+" is:"+dailyWage);
		}
		System.out.println("Total Month wage is:"+monthWage);
	}
}
