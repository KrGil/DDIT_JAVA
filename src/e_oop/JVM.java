package e_oop;

public class JVM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * JVM(Java Virtual Machine)
		 *  - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 *  - 운영체제 -> JVM -> 자바 프로그램
		 *  - 장점 : 운영체제에 상관업싱 실행할 수 있다.
		 *  - 단점 : 속도가 느리다.
		 *  
		 *  
		 *  JVM 메모리 구조
		 *   - Method Area(메서드 영역) : 클래스 맴버가 저장된다.//static 붙은 애들. 클래스 변수, 클래스 메서드
		 *   - Call Stack(호출 스택) : 현재 호출되어 있는 메서드가 저장된다. new 메서드명(); 들
		 *   - Heap : 객체가 저장된다. 
		 * 
		 */
		
		
//		JVM.classMethod();
//		new JVM(); //객체 생성
//		int a = new JVM().instanceVar;
		
		//1. 프로그램 실행시 main(), classVar, classMethod()가 MethodArea에 저장됨.
		//2. main()이 호출되어 CallStack에 저장됨.
		
		System.out.println(classVar);
		//3. System클래스의 out이 MethodArea에 저장됨.
		//4. println()이 호출되어 CallStack에 저장됨.
		//5. println()이 classVar를 출력 후 CallStack에서 삭제됨.
		
		classMethod();
		//6. classMethod()가 호출되어 CallStack에 저장됨.
		//7. instanceVar는 메모리에 존재하지 않기 때문에 사용할 수 없음.
		//8. println()이 호출되어 CallStack에 저장됨.
		//9. prindln()이 classVar를 출력 후 CallStack에서 삭제됨.
		//10. classMethod()의 실행이 종료되어 CallStack에서 삭제됨.
		
		
		JVM jvm = new JVM();
		//11. JVM객체가 Heap에 저장됨
		//12. jvm변수가 CallStack에 생성되고, JVM객체의 주소가 저장됨.
		// 지역변수는  main메서드가 끝날대 같이 없어짐.
		
		System.out.println(jvm.instanceVar);
		//13. println()이 호출되어 CallStack에 저장됨
		//14. println()이 instanceVar를 출력 후 CallStack에서 삭제됨.
		
		jvm.instanceMethod();
		//15. instanceMethod()가 호출되어 CallStack에 저장됨.
		//16. println()이 호출되어 CallStack에 저장됨.
		//17. println()이 instanceVar를 출력 후 CallStack에서 삭제됨.
		//18. println()이 호출되어 CallStack에서 저장됨.
		//19. println()이 classVar를 출력 후 CallStack에서 삭제됨.
		//20. instanceMethod()의 실행이 종료되어 CallStack에서 삭제됨.
		
		jvm = null;
		//21. jvm변수에 null이 저장됨.
		//22. 어디에서도 주소를 참조하지 않는 jvm객체는 GarbageCollector에 의해 삭제됨.
		
		//23.main()의 실행이 종료되어 CallStack에서 삭제됨.
		//24.프로그램이 종료되고 MethodArea의 데이터가 삭제됨.
		
		//TV 내가 한것
		String s = "";
		int i = 0;
		System.out.println("TV앞에 앉았습니다.");
		TV tv = new TV();
		System.out.print("TV를 켜시겠습니까?(Y/N) > ");
		if(tv.on_off(s = TV.input_string())){		
			boolean b = false;
			while(!b){
				System.out.println("무엇을 하시겠습니까?(1/2/3)");
				System.out.println("1. TV 전원");
				System.out.println("2. TV 채널");
				System.out.println("3. TV 소리");
				int a = TV.input_int();
				if(a == 1){
					System.out.print("TV를 끄시겠습니까?(Y/N) > ");
					tv.off_on(TV.input_string());
					b = true;
				}
				if(a == 2){
					System.out.print("TV 채널을 입력해 주세요(숫자) > ");
					tv.channel(TV.input_int());
				}if(a == 3){
					System.out.print("TV 소리를 조정하시겠습니까?(up/down) > ");
					tv.volume(TV.input_string());
				}
			}
		}
		//TV 쌤이 하는것
		
		
	}
	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	static void classMethod(){
//		System.out.println(new JVM().instanceVar); // 아직 메모리에 올라가지 않은 상태 --올려 주어야한다(위의 메서드를 실행해서)
//		System.out.println(instanceVar); // 아직 메모리에 올라가지 않은 상태 --올려 주어야한다(위의 메서드를 실행해서)
		System.out.println(classVar);  // static이라 메모리에 올라간 상태
	}

}
