package i_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import e_oop.ScanUtil;

public class Board1 {
	ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	HashMap<String, Object> board = new HashMap();
	HashMap<String, Object> hashMap = new HashMap();
	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	Date d;
	String s;

	
	int sc;
	void showMenu(){ //메인화면
		System.out.println("--------------------------------");
		System.out.println("번호" +"\t"+ "제목"+"\t"+"\t"+"작성자"+"\t"+"작성일");
		System.out.println("--------------------------------");
		for(int i = table.size()-1; i >=0; i --){
			hashMap = table.get(i);
			System.out.print(hashMap.get("번호")+"\t");
			System.out.print(hashMap.get("제목")+"\t");
			System.out.print(hashMap.get("내용")+"\t");
			System.out.print(hashMap.get("작성자")+"\t");
			System.out.println(hashMap.get("작성일"));
		}
		System.out.println("--------------------------------");
		System.out.println("1.조회" +"\t"+ "2.등록"+"\t"+"0.종료");
	}
	void showInfo(){ //1.조회
		System.out.println("몇번 게시글을 조회하시겠습니까?");
		sc = new ScanUtil().nextInt();
		System.out.println("--------------------------------");
			hashMap = table.get(sc-1);
			Set<String> keySet = hashMap.keySet();
			for(String key : keySet){
				System.out.println(key + " : " + hashMap.get(key));
			}
		System.out.println("--------------------------------");
		System.out.println("1.수정" +"\t"+ "2.삭제"+"\t"+"0.나가기");
		sc = new ScanUtil().nextInt();
		inquiry : switch(sc){
		case 1:
			break;
		case 2:
			break;
		case 0:
			break inquiry;
		}
	}
	void insert(){
		board = new HashMap();
		board.put("번호", table.size());
		System.out.println("제목을 입력하세요>");
		s = new ScanUtil().nextLine();
		board.put("제목", s);
		System.out.println("내용을 입력하세요>");
		s = new ScanUtil().nextLine();
		board.put("내용", s);
		System.out.println("성함을 입력하세요>");
		s = new ScanUtil().nextLine();
		board.put("작성자", s);
		table.add(board);
	}
	void data(){
		board.put("번호", "1");
		board.put("제목", "111");
		board.put("내용", "1111");
		board.put("작성자", "1111");
		board.put("작성일", "11111");
		table.add(board);
	}
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어 주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * -----------------------------
		 * 번호 		제목		 작성자		 작성일
		 * --------------------------------
		 * 4	안녕하세요	 	홍길동		12/15
		 * 3	안녕하세요 		홍길동		12/15
		 * 2	안녕하세요 		홍길동		12/15
		 * 1	안녕하세요 		홍길동		12/15
		 * ----------------------------------
		 * 1.조회 2.등록 3.종료
		 * 
		 */
		
		Board1 b = new Board1();
		b.data();
		run : while(true){
			b.showMenu();
			b.sc = new ScanUtil().nextInt();
			switch(b.sc){
			case 1:
				b.showInfo();
				break;
			case 2:
				b.insert();
				break;
			case 0:
				System.exit(0);	
			}
		}
	}
}
