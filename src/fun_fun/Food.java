package fun_fun;

public class Food {
	String name;
	int food;
	int random;
	
	Food(String name, int food){
		this.name = name;
		this.food = food;
	}
	
	int hunt(){
		random = (int)(Math.random()*101);
		if(random < 51){
			System.out.println("사냥에 성공!");
			food += 4;
		}
		else{
			System.out.println("사냥 실패!");
		}
	
		return food;
	}
	
	
}
