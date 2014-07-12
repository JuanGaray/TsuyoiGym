package tsuyoigym.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RutinaDAO implements RutinaIF{
	String url="jdbc:mysql://localhost:3306/tsuyoigym?user=root&password=root";
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void registrarRutina(int a, int b, int c, int d, String e, int f) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into rutina values(?,?,?,?,?,?)";
		con = getConnection();
		
		try{
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,a);
			pstmt.setInt(2,b);
			pstmt.setInt(3,c);
			pstmt.setInt(4,d);
			pstmt.setString(5,e);
			pstmt.setInt(6,f);
			
			pstmt.executeUpdate();
			
		}catch(SQLException e1){
			 e1.printStackTrace();
		}finally{
			try{
				pstmt.close();
				con.close();
			}catch(SQLException e1){
				e1.printStackTrace();
			}
		}
		
		
	}
	
	

}
