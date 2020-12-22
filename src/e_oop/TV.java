package e_oop;

import java.util.Scanner;

public class TV {
	//JVM 내가 한것
	static boolean on_off;
	static int channel;
	static int volume = 10;
	//입력값 받기
	private static Scanner s = new Scanner(System.in);
	//String 받기
	static String input_string(){
		return s.nextLine();
	}
	//int 받기
	static int input_int(){
		return Integer.parseInt(s.nextLine());
	}
	
	//메서드 온 오프
	boolean on_off(String a){
		int b = 0;
		while(b ==0){
			if (a.equals("Y") || a.equals("y") ){
				System.out.println("TV가 켜졌습니다.");
				on_off = true;
				b=1;
			}else if (a.equals("N") || a.equals("n") ){
				System.out.println("TV가 꺼졌습니다.");
				on_off = false;
				b=1;
			}else{
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("TV를 켜시겠습니까? > ");
				a = input_string();
			}
		}
		return on_off;
	}
	//매서으 오프_온
	boolean off_on(String a){
		int b = 0;
		while(b ==0){
			if (a.equals("Y") || a.equals("y") ){
				System.out.println("안녕히 주무세요.");
				System.out.println("TV가 꺼졌습니다.");
				on_off = true;
				b=1;
			}else if (a.equals("N") || a.equals("n") ){
				System.out.println("TV가 이미 켜져 있습니다.");
				on_off = false;
				b=1;
			}else{
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("TV를 켜시겠습니까? > ");
				a = input_string();
			}
		}
		return on_off;
	}
	
	//메서드 채널 돌리기
	void channel(int a){
		System.out.println("채널이 "+a+"로 변경되었습니다.");
	}
	
	//메서드 볼륨 올리기, 내리기
	int volume(String a){
		int b = 0;
		while(b ==0){
			if (a.equals("up") || a.equals("UP")){
				volume ++;
				System.out.println("현재 소리크기는 "+volume+"입니다.");
				b=1;
			}else if(a.equals("down") || a.equals("DOWN")){
				volume --;
				System.out.println("현재 소리크기는 "+volume+"입니다.");
				b=1;
			}else{
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("다시 입력하시겠습니까? > ");
				a = input_string();
			}
		}
		return volume;
	}
	
	
	//쌤이 한것 
	//변수 선언
	boolean power = false; //전원
	int channel1 =1; //채널
	int volume1 =5; //음량
	
	final int Min_channel = 1;
	final int Max_channel = 100;
	final int Min_volume = 0;
	final int Max_volume = 10;
	
	//파워
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV꺼짐");
	}
	
	void changeCannel(int channel1){
		if(power){
			if(Min_channel <= channel1 && channel1 <= Max_channel){
				this.channel1 = channel1; // 전역변수와 지역변수의 이름이 같을 때 구분을 위해서 쓴다.
			}
			System.out.println("채널. "+this.channel1);
		}
	}
	
	void channelUp(){
		changeCannel(channel1+1);
	}
	void channelDown(){
		changeCannel(channel1-1);
	}
	
	void volumeUp(){
		if(power){
			if(volume1 < Max_volume){
				volume1++;
			}
			showVolume();
		}
	}
	void volumeDown(){
		if(power){
			if(Min_volume < volume1){
				volume1--;
			}
			showVolume();
		}
	}
	void showVolume(){
		System.out.println("음량. ");
		for(int i = Min_volume + 1;  i <= Max_volume; i++){
			if(i <= volume1){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		TV tv = new TV();
		TV.input_int();
		
		while(true){
			System.out.println("----------------------------------");
			System.out.println("1.전원  2.채널변경  3.채널업  4.채널다운");
			System.out.println("5.볼륨업  6.볼륨다운  0.종료");
			System.out.println("----------------------------------");
			System.out.println("번호입력 > ");
			int input = ScanUtil.nextInt();
			
			switch(input){
			case 1: tv.power(); break;
			case 2: System.out.print("변경할 채널 입력 > ");
					int ch = ScanUtil.nextInt();
					tv.changeCannel(ch);
					break;
			case 3: tv.channelUp(); break;
			case 4: tv.channelDown(); break;
			case 5: tv.volumeUp(); break;
			case 6: tv.volumeDown(); break;
			case 0: System.out.println("종료되었습니다.");
					System.exit(0);
			}
		}
	}
}
