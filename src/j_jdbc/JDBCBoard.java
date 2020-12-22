
package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class JDBCBoard {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "Gil";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	static int cc;
	Date date;
	SimpleDateFormat format = new SimpleDateFormat ( "yyyyMMdd HHmmss");
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 * 수정, 삭제
		 */
		JDBCBoard b = new JDBCBoard();
		run : while(true){
			
			b.showInfo();
			int s =ScanUtil.nextInt();
			switch(s){
			case 1:
				int num = b.showMenu();
				s = new ScanUtil().nextInt();
				switch(s){
				case 1 :
					b.update(num);
					break;
				case 2 :
					
				case 3 :
					break;
				}
				break;
			case 2:
				b.insert(b.insert_data());
				b.showInfo();
				break;
			case 0:
				break run;
			}
		}
	}
	
	static void connect (){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	}
	int showMenu(){
		System.out.println("몇번 게시글을 보시겠습니까?");
		int s = ScanUtil.nextInt();
		connect();
		try {//드라이버를 관리해주는 클래스.
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM TB_JDBC_BOARD";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			int columnCount = md.getColumnCount();
			cc = columnCount;
			
//			System.out.println("     "+"번호"+"         "+"제목"+"\t"+"작성자"+"\t"+"\t"+"날짜"+"\t");
			System.out.println("====================================================");
			int cnt = 0;
			while(rs.next()){	// ROW 출력
				cc = cnt++;
				if(s == cnt){
					String title = rs.getString(2);
					String content = rs.getString(2);
					String user_id = rs.getString(4);
					String reg_date = rs.getString(5);
					ArrayList<Object> list = new ArrayList<>();
					list.add(title);
					list.add(user_id);
					list.add(reg_date);
					System.out.println("TITLE : " + title);
					System.out.println("CONTENT : " + user_id);
					System.out.println("USER_ID : " + content);
					System.out.println("REG_DATE : " + reg_date);
					System.out.println();
					
				}
			}
			System.out.println("====================================================");
			System.out.println("            "+"1.수정"+"          "+"2.삭제"+"          "+"0.종료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) {}
			if(ps != null) try { ps.close(); } catch (SQLException e) {}
			if(con != null)	try { con.close(); } catch (SQLException e) {}
		}
		return s;
	}
	void showInfo(){
		connect();
		try {//드라이버를 관리해주는 클래스.
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM TB_JDBC_BOARD ORDER BY BOARD_ID DESC";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			int columnCount = md.getColumnCount();
			cc = columnCount;
			
			System.out.println("     "+"번호"+"         "+"제목"+"\t"+"작성자"+"\t"+"\t"+"날짜"+"\t");
			System.out.println("====================================================");
			int cnt = 0;
			while(rs.next()){	// ROW 출력
//				System.out.println("====================================================");
				String title = rs.getString(2);
				String user_id = rs.getString(4);
				String reg_date = rs.getString(5);
//			ArrayList<Object> list1 = 
				System.out.print("   "+rs.getString(1)+"     "+rs.getString(2)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t");
				System.out.println();
				
			}
			System.out.println("====================================================");
			System.out.println("            "+"1.조회"+"          "+"2.입력"+"          "+"0.종료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) {}
			if(ps != null) try { ps.close(); } catch (SQLException e) {}
			if(con != null)	try { con.close(); } catch (SQLException e) {}
		}
	}
	
	HashMap<String,String> insert_data(){
		System.out.println("TITLE : ");
		String title = ScanUtil.nextLine();
		System.out.println("CONTENT : ");
		String content = ScanUtil.nextLine();
		System.out.println("ID : ");
		String id = ScanUtil.nextLine();
		
		HashMap<String, String> board = new HashMap<>();
		board.put("TITLE", title);
		board.put("CONTENT", content);
		board.put("ID", id);
		
		return board;
	}
	
	void insert(HashMap<String, String> board){
		connect();
		try {//드라이버를 관리해주는 클래스.
			con = DriverManager.getConnection(url, user, password);
//			 
			String sql = "INSERT INTO TB_JDBC_BOARD values((select nvl(max(board_id), 0) + 1 as board_id from TB_JDBC_BOARD),?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			date = new Date();
			String d = format.format(date);
			System.out.println(board.get("TITLE"));
			System.out.println(cc);
			ps.setString(1,board.get("TITLE"));
			ps.setString(2,board.get("CONTENT"));
			ps.setString(3,board.get("ID"));
//			ps.setString(4,"20201216");
			int result = ps.executeUpdate();
			showInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) {}
			if(ps != null) try { ps.close(); } catch (SQLException e) {}
			if(con != null)	try { con.close(); } catch (SQLException e) {}
		}
	}
	void update(int num){
		connect();
		try {//드라이버를 관리해주는 클래스.
			con = DriverManager.getConnection(url, user, password);
			String sql = "UPDATE TB_JDBC_BOARD SET TITLE = ?, CONTENT = ?, USER_ID = ? WHERE board_id = ?";
			System.out.println("제목을 적어주세요");
			String a = new ScanUtil().nextLine();
			System.out.println("내용을 적어주세요");
			String b = new ScanUtil().nextLine();
			System.out.println("이름을 적어주세요");
			String c = new ScanUtil().nextLine();
			ps = con.prepareStatement(sql);
			ps.setString(1,a);
			ps.setString(2,b);
			ps.setString(3,c);
			ps.setInt(4,num);
			int result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) {}
			if(ps != null) try { ps.close(); } catch (SQLException e) {}
			if(con != null)	try { con.close(); } catch (SQLException e) {}
		}
	}
	void delete(int num){
		connect();
		try {//드라이버를 관리해주는 클래스.
			con = DriverManager.getConnection(url, user, password);
			String sql = "DELETE TB_JDBC_BOARD WHERE board_id = ?";
			System.out.println("정말 삭제하시겠습니까(Y/N)?");
			String a = new ScanUtil().nextLine();
			if(a.equals("y") ||a.equals("Y")){
				
			}
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,num);
			int result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) {}
			if(ps != null) try { ps.close(); } catch (SQLException e) {}
			if(con != null)	try { con.close(); } catch (SQLException e) {}
		}
	}

}
