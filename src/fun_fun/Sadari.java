package fun_fun;

public class Sadari {
	public static void sadari(){
		String dari = "";
		int number = 5;
		System.out.println("----------------");
		for(int i =0; i < number; i ++ ){
			dari += "|\t";
		}
		
		int random =(int) (Math.random()*number);
		for(int i =0; i < number; i ++){
			System.out.println(dari);
			System.out.println("  -----");
		}
	}
}
