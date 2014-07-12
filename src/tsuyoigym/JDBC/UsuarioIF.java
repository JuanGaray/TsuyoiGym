package tsuyoigym.JDBC;

public interface UsuarioIF {
	public void insertarusuario(int a,int b, String c, String d);
	public int obtenusuario(String a);
	public int validar(String a, String c);
}
