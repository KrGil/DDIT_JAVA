package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class jdbc2 {
	public static void main(String[] args) {
		//데이터베이스 접속 정보
		//드라이버 정보		//오라클디벨로퍼 계정(포트?)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Gil";
		String password = "java";
		
		//밖에서 변수를 만드는 이유는 닫아야 하기 때문이다.
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {//드라이버를 관리해주는 클래스.
			con = DriverManager.getConnection(url, user, password);
//			String sql = "select * from member where mem_id = ?";
			String sql = "INSERT INTO dept_test values(?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 20);
			ps.setString(2, "JAVA");
			ps.setString(3, "LOC");
//			ps.setObject(parameterIndex, x);
			
			//select 
//			rs = ps.executeUpdate();
			int result = ps.executeUpdate();
			
			System.out.println(result);
			//타입을 잘 모를 때 ctrl+1 해서 local variable 생성해보자!
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			System.out.println(rs.getMetaData());
			
			//컬럼의 수를 가져오는 메서드!! 필요함!
			int columnCount = md.getColumnCount();
			
			while(rs.next()){
//				for(int i= 1; i <= columnCount; i++){
//					System.out.print(md.getColumnName(i) + "\t");
//					System.out.print(rs.getObject(i) + "\t");
//				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) {}
			if(ps != null) try { ps.close(); } catch (SQLException e) {}
			if(con != null)	try { con.close(); } catch (SQLException e) {}
		}

	}
	
}
