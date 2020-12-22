package g_oop2;

public class AccessTest {
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		//다른 클래스에서 사용할 수 없다.
//		System.out.println(am.privateVar);
//		am.privatedMethod();
		
		
		Time t = new Time();
		
		//변수에 직접 값을 넣으면 제한할 방법이 없다.
		//그래서 method를 통해서 값을 넣으면 제한을 걸 수 있다.
		//그래서 private이나 protected를 사용한다.
//		t.hour = 9;
//		t.minute = 380;
//		t.second = -30;
		t.setHour(22);
		t.setMinute(59);
		t.setSecond(55);
		
		System.out.println(t.getTime());
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 사용하는데 불필요한 멤버를 숨기기 위해
		 * 
		 */
		t.clock();
		
		
	}
	
}
