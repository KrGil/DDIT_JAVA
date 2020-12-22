package i_collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키와 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키와 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		HashMap<String, Object> map = new HashMap<>();
		//순서라는 개념은 존재하지 않는다.
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Scanner(System.in));
		
		System.out.println(map);
		//하나의 키로 하나의 값만 저장 가능.
		map.put("b", "이순신");
		System.out.println(map);

		map.remove("c");
		System.out.println(map);
		
		Object value = map.get("b");
		System.out.println(value);
		
		//값 받기
		//Object로 받으면 불편하댄다... 근데 왜??
		//Object는 부모클래스이기 때문에 String클래스에 속해있는 메서드들을 사용하지 못하기 때문에 불편하다.
		//ex) String.length()와 같은 메서드를 사용하지 못한다.  
		
		int value1 = (int) map.get("a");
		String value2 = (String)map.get("b");
		
		
		Set<String> keys = map.keySet(); // 저장된 모든 키
		//set으로 key값 표현하기
		for(String key : keys){
			System.out.println(key + " : " + map.get(key));
		}
		
		//for문의 표현방법
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : list){
		} //or
		for(Integer i : list){
		}
		
		//회원 테이블
		//아이디, 비밀번호, 이름, 전화번호
		/*
		 * id		password		name		tel
		 * admin	admin123		관리자		010-1234-5678
		 * 
		 */
		ArrayList<HashMap<String,String>> table = new ArrayList<>();
		HashMap<String, String> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-5678");
		table.add(user);
//		System.out.println(user);
		
		user = new HashMap<>();
		user.put("id", "Gil");
		user.put("password", "gil123");
		user.put("name", "회원");
		user.put("tel", "010-4321-8765");
		
		table.add(user);
		
		System.out.println(table);
		for(int i =0; i < table.size(); i ++){
			HashMap<String, String> hashMap = table.get(i);
//			Set<String> column = table.get(i).keySet();
			Set<String> column = hashMap.keySet();
			for(String key : column){
//				System.out.println(key + " : " + table.get(i).get(key));
				System.out.println(key + " : " + hashMap.get(key));
			}
			System.out.println("---------------------------");
		}
	}
}




