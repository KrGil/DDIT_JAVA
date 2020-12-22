package j_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBC {
	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성
		 * 2. Statement 생성(쿼리)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과추철(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */
		
		//데이터베이스 접속 정보
						//드라이버 정보		//오라클디벨로퍼 계정(포트?)
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "Gil";
//		String password = "java";
//		
//		//밖에서 변수를 만드는 이유는 닫아야 하기 때문이다.
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		
//		try {//드라이버를 관리해주는 클래스.
//			con = DriverManager.getConnection(url, user, password);
//			String sql = "select * from dept";
//			ps = con.prepareStatement(sql);
//			// 두가지 실행 방법이 있다.
//
//			//select 
//			rs = ps.executeQuery();
//			
//			//create insert, update, delete
//			//return -- 영향받은 행(row)의 수를 리턴
////			int result = ps.executeUpdate();
//			
//			//행(row)를 다음다음다음으로 넘긴다.
//			int cnt = 1;
//			
//			System.out.println(rs.getStatement());
//			//alt + shift + a
//			//한번에 글 적기
//			while(rs.next()){
//				for(int i =1; i < cnt; i ++){
//				String deptno = rs.getString(i); //인덱스로 값을 가져오기(인덱스는 1부터 시작)
////					String dname = rs.getString(2); //인덱스로 값을 가져오기(인덱스는 1부터 시작)
////					String loc = rs.getString(3); //인덱스로 값을 가져오기(인덱스는 1부터 시작)
////				String memPass = rs.getString("mem_pass"); //컬럼명으로 값을 가져오기
////				System.out.println("MEM_ID : " +memId + " / MEM_PASS : " + memPass );
//				System.out.print(deptno+"\t" );
//				}
//				System.out.println();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally{
//			if(rs != null) try { rs.close(); } catch (SQLException e) {}
//			if(ps != null) try { ps.close(); } catch (SQLException e) {}
//			if(con != null)	try { con.close(); } catch (SQLException e) {}
//		}
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
		// selectList(sql, param) 
		String sql = "SELECT * FROM dept WHERE ? = ?";
		List<Object> param = new ArrayList<>();
		param.add("deptno");
		param.add("deptno");
		List<Map<String, Object>> list = jdbc.selectList(sql, param);
		System.out.println(list);
		
		
		// selectList(sql)
		Board_test b = new Board_test();
		b.show();
		
		// selectOne(sql, param)
		sql = "SELECT * FROM dept WHERE deptno = ?";
		param = new ArrayList<>();
		param.add("20");
		Map<String, Object> selectOne = jdbc.selectOne(sql,param);
		System.out.println(selectOne);
		
		// selectOne(sql)
		sql = "SELECT * FROM dept WHERE deptno = 10";
		Map<String, Object> selectOne1 = jdbc.selectOne(sql);
		System.out.println(selectOne1);
//		
		// update(sql, param)
		param = new ArrayList<>();
		sql = "UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?";
		param.add("research");
		param.add("dallas");
		param.add(20);
		int update = jdbc.update(sql,param);
		System.out.println(update);
		
		// update(sql)
		sql = "UPDATE dept SET dname = 'accounting', loc = 'new your' WHERE deptno = 10";
		int update1 = jdbc.update(sql);
		System.out.println(update1);
	}
}







