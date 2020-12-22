package j_jdbc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board_test {
	private Map<String, Object> map = new HashMap<>();
	private List<Map<String, Object>> list = new ArrayList<>();
	String sql;
	JDBCUtil jdbc = JDBCUtil.getInstance();
	int board_no;
	String title;
	String content;
	String user;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	
	void show(){
		System.out.println("------------------------------");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("------------------------------");
		sql = "SELECT * FROM TB_JDBC_BOARD";
		List<Map<String, Object>> list1 = jdbc.selectList(sql);
		for(int i =0; i < list1.size(); i ++){
			Map<String, Object> map2 = list1.get(i);
			setBoard_no(((BigDecimal)map2.get("BOARD_NO")).intValue());

			title = (String) map2.get("TITLE");
			content = (String) map2.get("CONTENT");
			user = (String) map2.get("USER_ID");
			System.out.println(getBoard_no() + "\t" +title+"\t"+ user+"\t"+map2.get("REG_DATE"));
		}
//		System.out.println(list1);
		
	}
	void read(){
		
	}
	void insert(){
		
	}
	
}
