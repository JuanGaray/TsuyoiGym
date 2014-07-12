package tsuyoigym.JDBC;

public class Maquina {
	int idCliente;
	String tipoMaquina;
	int tipoHorario;
	int hora;
	int tiempo;
	int idMaquina;
	
	public  Maquina(){}
	
	public Maquina(int idCliente,String tipoMaquina,int tipoHorario,int hora, int tiempo, int idMaquina){
		this.idCliente=idCliente;
		this.tipoMaquina=tipoMaquina;
		this.tipoHorario=tipoHorario;
		this.hora=hora;
		this.tiempo=tiempo;
		this.idMaquina=idMaquina;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoMaquina() {
		return tipoMaquina;
	}

	public void setTipoMaquina(String tipoMaquina) {
		this.tipoMaquina = tipoMaquina;
	}
	public int getTipoHorario() {
		return tipoHorario;
	}

	public void setTipoHorario(int tipoHorario) {
		this.tipoHorario = tipoHorario;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}
	
	
}
