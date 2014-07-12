package tsuyoigym.JDBC;

public class Dieta {
	int idcliente;
	int tipohorario;
	String tipoalimento;
	float cantidadalimento;
	String observaciones;
	int idnutricionista;
	
	public Dieta(){}

	public Dieta(int idcliente, int tipohorario, String tipoalimento,
			float cantidadalimento, String observaciones, int idnutricionista) {
		super();
		this.idcliente = idcliente;
		this.tipohorario = tipohorario;
		this.tipoalimento = tipoalimento;
		this.cantidadalimento = cantidadalimento;
		this.observaciones = observaciones;
		this.idnutricionista = idnutricionista;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getTipohorario() {
		return tipohorario;
	}

	public void setTipohorario(int tipohorario) {
		this.tipohorario = tipohorario;
	}

	public String getTipoalimento() {
		return tipoalimento;
	}

	public void setTipoalimento(String tipoalimento) {
		this.tipoalimento = tipoalimento;
	}

	public float getCantidadalimento() {
		return cantidadalimento;
	}

	public void setCantidadalimento(float cantidadalimento) {
		this.cantidadalimento = cantidadalimento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdnutricionista() {
		return idnutricionista;
	}

	public void setIdnutricionista(int idnutricionista) {
		this.idnutricionista = idnutricionista;
	}
	
	
	
}	
