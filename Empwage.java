//UseCase 2=>Calculate Daily Wage

class Empwage {

	public static void main(String[] args){
	
		int fullTime = 1;
		int wagePerHour = 20;
		int workHour = 0;
		int check = (int)(Math.random()*2)+1;

		if(check == 1){
		
			workHour = 8;
		}
		else{
		
			workHour = 0;
		}
		int dailyWage = workHour * wagePerHour;
		System.out.println("Daily wage is:"+dailyWage);
	}

}

