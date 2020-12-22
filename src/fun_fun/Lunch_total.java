package fun_fun;

public class Lunch_total {
	int result(int a, int b){
		return a*b;
	}
	
	
	public double cal(int number, int price){
		double avg = 0;
		
		double number1 = number - number/10;
		avg = (number1*price)/number;
		return avg;
	}
}

