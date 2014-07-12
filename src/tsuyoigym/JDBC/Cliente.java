package tsuyoigym.JDBC;

public class Cliente {
	int id;
	String correo;
	int dni;
	String nombres;
	String apellidos;
	String distrito;
	String direccion;
	float peso;
	float altura;
	int edad;
	int tipousuario;
	
	public Cliente(){}

	public Cliente(int id, String correo, int dni, String nombres,
			String apellidos, String distrito, String direccion, float peso,
			float altura, int edad) {
		super();
		this.id = id;
		this.correo = correo;
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.distrito = distrito;
		this.direccion = direccion;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	
}
