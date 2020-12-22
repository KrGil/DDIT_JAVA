package fun_fun;

import e_oop.ScanUtil;

public class Boat_run {

	String name;
	int food;
	int hp;
	Food f;
	Boat b;
	
	Boat_run(){
		name = "Unkown";
		int food = 4;
		int hp = 0;
		
	}
	public static void main(String[] args) {
		new Boat_run().run();
	}
	
	void run(){
		System.out.println("==================");
		System.out.println("1.정보\t 2.배수리\t 3.사냥");
		f = new Food(name, food);
		b = new Boat(name);
		run : while(true){
			
			int s = ScanUtil.nextInt();
			switch(s){
			case 1: 
				showInfo();
				break;
			case 2:
				hp = b.repair();
				food--;
				break;
			case 3:
				food = f.hunt();
				food--;
				break;
			}
		}
	}
	void showInfo(){
		System.out.println("===================");
		System.out.println("이름  : "+ name);
		System.out.println("허기짐 : "+ food);
		System.out.println("수리도 : "+ hp);
	}
	
	
	
}
