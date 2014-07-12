package tsuyoigym.JDBC;

import java.util.List;

public interface ClienteIF {
	public void registrarCliente(int a,String b, int c, String d,String e,String f, String g, float h, float i, int j);
	public int validar(String a, String b);
	public List<Cliente> perfil(int a);
	
	}


