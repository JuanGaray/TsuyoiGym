package tsuyoigym.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO implements ClienteIF {
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

	
	public void registrarCliente(int a,String b, int c, String d, String e, String f,
			String g, float h, float i, int j) {
		
	
			Connection con = null;
			PreparedStatement pstmt = null;
			String sql = "insert into cliente values(?,?,?,?,?,?,?,?,?,?)";
			con = getConnection();
			
			try{
			
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1,a);
				pstmt.setString(2,b);
				pstmt.setInt(3,c);
				pstmt.setString(4,d);
				pstmt.setString(5, e);
				pstmt.setString(6, f);
				pstmt.setString(7, g);
				pstmt.setFloat(8, h);
				pstmt.setFloat(9, i);
				pstmt.setInt(10, j);
				
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

	public List<Cliente> perfil(int a) {

		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM cliente where = ? ";
		List<Cliente> lcliente = new ArrayList();
		
		try {
			con = getConnection();

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			while ( rs.next() ) {
				lcliente.add( new Cliente( rs.getInt(1),     // Columna 1 del SQL 
						                rs.getString(2),
						                rs.getInt(3),
						                rs.getString(4),
						                rs.getString(5),
						                rs.getString(6),
						                rs.getString(7),
						                rs.getFloat(8),
						                rs.getFloat(9),
						                rs.getInt(10)             
						                ) 
				             );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return lcliente;
	
	}
		
	

	

	

}
