package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import e_oop.ScanUtil;

public class Board {
	static HashMap<String, String> board;
	static ArrayList<HashMap<String, String>> table;
	static HashMap<String, String> hashMap;
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
		Board b = new Board();
		b.board();
		run : while(true){
			b.showInfo();
			try{
				int s = new ScanUtil().nextInt();
				switch(s){
				case 1 :
					b.info();
					break;
				case 2 :
					b.write();
					break;
				case 3 :
					b.update();
					break;
				case 4 :
					b.remove();
					break;
				case 5 :
					break run;
				}
			}catch(Exception e){
				System.out.println("숫자만 입력해 주세요!");
			}
		}
	}
	
	
	
	
	public void showInfo(){
		System.out.println("------------------------------------------");
		System.out.println("번호" + "\t" + "제목 "+ "\t" +"\t" +"작성자"+ "\t" +"작성일");
		System.out.println("------------------------------------------");
		
		for(int i = table.size()-1; i >= 0; i --){
			HashMap<String, String> hashMap = table.get(i);
			System.out.print(hashMap.get("번호(pk)")+ "\t");
			System.out.print(hashMap.get("제목")+ "\t"+ "\t");
			System.out.print(hashMap.get("작성자")+ "\t");
			System.out.print(hashMap.get("작성일")+ "\t");
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("1. 조회" + "\t" + "2. 등록" +"\t"+"3. 수정"+"\t"+"4. 삭제"+"\t" +"5.종료");
	}
	public void showInfo1(){
		System.out.println("------------------------------------------");
		System.out.println("번호" + "\t" + "제목 "+ "\t" +"\t" +"작성자"+ "\t" +"작성일");
		System.out.println("------------------------------------------");
		
		for(int i = table.size()-1; i >= 0; i --){
			HashMap<String, String> hashMap = table.get(i);
			System.out.print(hashMap.get("번호(pk)")+ "\t");
			System.out.print(hashMap.get("제목")+ "\t"+ "\t");
			System.out.print(hashMap.get("작성자")+ "\t");
			System.out.print(hashMap.get("작성일")+ "\t");
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("1. 내용보기" + "\t" + "2. 등록" +"\t"+"3. 수정"+"\t"+"4. 삭제"+"\t" +"5.종료");
	}
	public void board(){
		board = new HashMap<>();
		table = new ArrayList<>();
		
		board.put("번호(pk)", "1");
		board.put("제목", "1안녕하세요");
		board.put("내용", "1안녕하세요 홍길동입니다.");
		board.put("작성자", "홍길동");
		board.put("작성일", "2020/12/15");
		table.add(board);
		board = new HashMap<>();
		board.put("번호(pk)", "2");
		board.put("제목", "hi");
		board.put("내용", "2안녕하세요 홍길동입니다.");
		board.put("작성자", "홍길동");
		board.put("작성일", "2020/12/15");
		table.add(board);
		board = new HashMap<>();
		board.put("번호(pk)", "3");
		board.put("제목", "hello");
		board.put("내용", "3안녕하세요 홍길동입니다.");
		board.put("작성자", "홍길동");
		board.put("작성일", "2020/12/15");
		table.add(board);
		board = new HashMap<>();
		board.put("번호(pk)", "4");
		board.put("제목", "4안녕하세요");
		board.put("내용", "4안녕하세요 홍길동입니다.");
		board.put("작성자", "홍길동");
		board.put("작성일", "2020/12/15");
		table.add(board);
	}
	public void info(){
		System.out.println("몇 번글을 보시겠습니까?");
		int s = new ScanUtil().nextInt();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("제목" + "\t" + "\t"+ "\t"+ "내용 "+ "\t" +"\t" +"작성자"+ "\t" +"작성일");
		System.out.println("------------------------------------------");
		
			HashMap<String, String> hashMap = table.get(s-1);
			System.out.print(hashMap.get("제목")+ "\t"+ "\t");
			System.out.print(hashMap.get("내용")+ "\t");
			System.out.print(hashMap.get("작성자")+ "\t");
			System.out.print(hashMap.get("작성일")+ "\t");
			System.out.println();
		System.out.println("------------------------------------------");
//		HashMap<String, String> hashMap = table.get(s-1);
//		Set<String> keySet = hashMap.keySet();
//		for(String key : keySet){
//			if(key.equals("내용")){
//				System.out.print(hashMap.get(key)+ "\t");
//			}
//		}
		System.out.println();
	}
	public void write(){
		board = new HashMap<>();
		System.out.println("제목을 적어주세요.");
		String s1 = ScanUtil.nextLine();
		System.out.println("내용을 적어주세요.");
		String s2 = ScanUtil.nextLine();
		System.out.println("이름을 적어주세요.");
		String s3 = ScanUtil.nextLine();
		board.put("번호(pk)", String.valueOf(table.size()+1));
		board.put("제목", s1);
		board.put("내용", s2);
		board.put("작성자", s3);
		board.put("작성일", "2020/12/15");
		table.add(board);
	}
	public void remove(){
		System.out.println("어떤 게시글을 삭제하겠습니까?");
		int s = new ScanUtil().nextInt();
		table.remove(s-1);
		for(int i = 0; i < table.size();  i++){
			if(i >= s-1){
				hashMap = table.get(i);
				Set<String> keySet = hashMap.keySet();
				hashMap.put("번호(pk)", String.valueOf(i+1));
//				for(String key : keySet){
//					if(key.equals("번호(pk)")){
//						hashMap.put(key, String.valueOf(Integer.parseInt(hashMap.get(key))-1));
//					}					
//				}
			}
		}
	}
	
	public void update(){
		System.out.println("어떤 게시글을 수정하시겠습니까?(번호입력)");
		int s1 = new ScanUtil().nextInt()-1;
		
		HashMap<String, String> hashMap = table.get(s1);
		Set<String> keySet = table.get(s1).keySet();
		for(String key : keySet){
			System.out.print(key+" : "+hashMap.get(key)+"\t");
		}
//		
//		System.out.print(hashMap.get("번호(pk)")+ "\t");
//		System.out.print(hashMap.get("제목")+ "\t"+ "\t");
//		System.out.print(hashMap.get("작성자")+ "\t");
//		System.out.print(hashMap.get("작성일")+ "\t");
		System.out.println();
		
		hashMap = table.get(s1);
		System.out.println("제목을 수정 하시겠습니까?(Y/N)");
		String s = new ScanUtil().nextLine();
		if(s.equals("Y")||s.equals("y")){
			System.out.println("수정할 제목을 적어주세요.");
			s = new ScanUtil().nextLine();
			hashMap.put("제목", s);
		}
		System.out.println("내용을 수정 하시겠습니까?(Y/N)");
		s = new ScanUtil().nextLine();
		if(s.equals("Y")||s.equals("y")){
			System.out.println("수정할 내용을 적어주세요.");
			s = new ScanUtil().nextLine();
			hashMap.put("내용", s);
			System.out.println("수정 되었습니다.");
			System.out.println(hashMap);
		}
		
	}
}
