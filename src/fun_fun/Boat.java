package fun_fun;

public class Boat {
	String name;
	int hp;
	int random;
	
	Boat(String name){
		this.name = name;
		this.hp = 0;
	}
	
	int repair(){
		random = (int) (Math.random()*101);
		if(random < 51){
			hp++;
			System.out.println("hp가 1만큼 증가하여 "+hp+"가 되었습니다.");
		}else{
			System.out.println("수리에 실패하였습니다.");
		}
		return hp;
	}
	
}
