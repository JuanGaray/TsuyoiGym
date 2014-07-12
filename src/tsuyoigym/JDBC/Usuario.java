package tsuyoigym.JDBC;

public class Usuario {
	int idusuario;
	int tipousuario;
	String usuario;
	String password;
	
	public Usuario(){}

	public Usuario(int idusuario, int tipousuario, String usuario, String password) {
		super();
		this.idusuario= idusuario;
		this.tipousuario = tipousuario;
		this.usuario = usuario;
		this.password = password;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(int tipousuario) {
		this.tipousuario = tipousuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
