package tsuyoigym.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO implements UsuarioIF {
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
	public void insertarusuario(int a, int b, String c, String d) {

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into usuario values(?,?,?,?)";
		con = getConnection();
		
		try{
		
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,a);
			pstmt.setInt(2,b);
			pstmt.setString(3,c);
			pstmt.setString(4,d);
			
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
	public int obtenusuario(String a) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int valor=0;
		
		String sql = "select tipousario from usuario where usuario = ?";
		con = getConnection();
		ResultSet rs = null;
		try{
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, a);
			rs = pstmt.executeQuery();
			while(rs.next()){
				valor = rs.getInt("tipousario");		
			}			
		}catch(SQLException e1){
			valor = 0;
			e1.printStackTrace();	
		}finally{
			try{
				rs.close();
				pstmt.close();
			    con.close();
		}catch(SQLException e1){
			e1.printStackTrace();
		}
		}
		return valor;
		
		
	}
	public int validar(String a, String b) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int valor = 0;
		
		String sql = "select 1 as valor from usuario where usuario = ? and password = ?";
		con = getConnection();
		ResultSet rs = null;
		try{
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			rs = pstmt.executeQuery();
			while(rs.next()){
				valor = rs.getInt("valor");		
			}			
		}catch(SQLException e1){
			valor = 0;
			e1.printStackTrace();		
		}finally{
			try{
				rs.close();
				pstmt.close();
			    con.close();
		}catch(SQLException e1){
			e1.printStackTrace();
		}
		}
		return valor;
		
		
	}
}
