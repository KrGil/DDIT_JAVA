package e_oop;

public class Finger {
	//지문인식기
	//손을 댄다 (on/off) - boolean
	//random - 네트워크가 3개면(ㅁㅁㅁㅁㅁ)로 출력
	//100퍼로 인증됨.
	//떨어질수록 30퍼씩 확률을 떨어뜨린다.
	//random을 출력한다. 확률은 약 20퍼로 조정 1~10까지 중 1~2의 경우만 지문 인식이 되었다고 뜨게한다. 
	boolean on_off = false;
	int network = 0;
	int num = 0;
	String[] jimun = {"지","문"," ","인","증"," ","중",".",".","."	};
	
	//지문 가져다 대기
	void on_off(){
		on_off = !on_off;
		
		System.out.println(on_off ? "지문 인증 중..." : "손가락을 가져다 놓으세요.");
	}
	
	//네트워크 표시
	int network(){
		network = (int)(Math.random()*3)+1;
		System.out.println("현재 네트워크 상태는");
		for(int i =0; i < 4; i ++){
			if(i <network){
				try {
					Thread.sleep(400);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(")");
			}
		}
		System.out.println(" 입니다.");
		return network;
	}
	
	//인증되었습니다. 다시 시도해 주세요.
	void certification(int network){
		if(on_off){
			boolean a = false;
			try {
				Thread.sleep(400);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(!a){
				num = (int)(Math.random()*10)+1;
//				System.out.println(num);
				if(network ==3){
					System.out.println("인증 되었습니다.");
					System.out.println("안녕히 가십시오.");
					a = true;
				}else if(network ==2){
					if(num < 7){
						System.out.println("인증 되었습니다.");
						System.out.println("안녕히 가십시오.");
						a = true;
					}else{
						for(int i = 0; i < jimun.length; i ++){
							try {
								Thread.sleep(400);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(jimun[i]);
						}
						System.out.println();
						System.out.println("시간이 초과되었습니다. 다시 시도해 주세요.");
						System.out.println("다시 시도 하시겠습니까?(Y/N)");
						String ans = ScanUtil.nextLine();
						if(ans.equals("Y")||ans.equals("y")){
							num = (int)(Math.random()*10)+1;
						}else{
							System.out.println("까먹지말고 꼭 찍고가기를...");
							break;
						}
					}
				}else{
					if(num < 3){
						System.out.println("인증 되었습니다.");
						System.out.println("안녕히 가십시오.");
						a = true;
					}else{
						for(int i = 0; i < jimun.length; i ++){
							try {
								Thread.sleep(400);    //thread에서 0.1초 단위로 한 쪽을 쉬게 하는 메서드이다.
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(jimun[i]);
						}
						System.out.println();
						System.out.println("시간이 초과되었습니다. 다시 시도해 주세요.");
						System.out.println("다시 시도 하시겠습니까?(Y/N)");
						String ans = ScanUtil.nextLine();
						if(ans.equals("Y")||ans.equals("y")){
							num = (int)(Math.random()*10)+1;
						}else{
							System.out.println("까먹지말고 꼭 찍고가기를...");
							break;
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Finger f = new Finger();
		int a = f.network();
//		f.on_off();
//		f.certification(2);
		System.out.println("지문인증을 하러 가시겠습니까?(Y/N)");
		String ans = ScanUtil.nextLine();
		if(ans.equals("Y")||ans.equals("y")){
			System.out.println("1. 지문인증하기");
			System.out.println("2. 집가기");
			while(true){
				int answer = ScanUtil.nextInt();
				switch(answer){
				case 1: f.on_off(); f.certification(a);break;
				case 2:System.out.println("새로운 기기가 필요함...");
						System.exit(0);
				}
			}
		}else{
			System.out.println("안녕히 가세요.");
		}
	}
}
