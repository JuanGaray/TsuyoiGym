package tsuyoigym.JDBC;

public class Rutina {

	int idCliente;
	int tipoHorario;
	int tipoEjercicio;
	int repeticiones;
	String observaciones;
	int idInstructor;
	
	public Rutina (){}
	
	public Rutina(int idCliente, int tipoHorario, int tipoEjercicio, int repeticiones, String observaciones,int idInstructor){
		this.idCliente=idCliente;
		this.tipoHorario=tipoHorario;
		this.tipoEjercicio=tipoEjercicio;
		this.repeticiones=repeticiones;
		this.observaciones=observaciones;
		this.idInstructor=idInstructor;
				
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getTipoHorario() {
		return tipoHorario;
	}

	public void setTipoHorario(int tipoHorario) {
		this.tipoHorario = tipoHorario;
	}

	public int getTipoEjercicio() {
		return tipoEjercicio;
	}

	public void setTipoEjercicio(int tipoEjercicio) {
		this.tipoEjercicio = tipoEjercicio;
	}

	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdInstructor() {
		return idInstructor;
	}

	public void setIdInstructor(int idInstructor) {
		this.idInstructor = idInstructor;
	}

	

}
