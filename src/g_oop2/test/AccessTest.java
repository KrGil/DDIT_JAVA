package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//다른 패키지에서 사용할 수 없다. 그러나 상속받으면 사용할 수 있다!
		//하지만 이렇게 사용하면 안된다. 내것 처럼 사용해야 한다.
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		//다른 패키지에서 사용할 수 없다.
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		//다른 클래스에서 사용할 수 없다.
//		System.out.println(am.privateVar);
//		am.privatedMethod();
	}
	
}
