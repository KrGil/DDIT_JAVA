package d_array;

public class StringSpeedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String은 +로 더하면 기존에 있는거 버리고 아에 새로운 문자열을 만든다.
		
//		String str = "a";
//		long start = System.currentTimeMillis();// 현재 시간을 나타내는 메서드
//		for(int i = 0; i < 200000; i ++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
		//StringBuffer class!!!
		StringBuffer sb = new StringBuffer("a");//기존에 있던 문자열을 계속 변경!!
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000000; i ++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		
	}
}
