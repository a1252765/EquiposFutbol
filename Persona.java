public class Persona{
	
	String nombre, apellidopaterno,apellidomaterno;
	int edad;
	float peso;
	float estatura;
	String nacionalidad;
	String RFC;
	
	
	public Persona(String nombre, String apellidopaterno, String apellidomaterno, int edad, float peso, float estatura, String nacionalidad, String RFC){
		setNombre(nombre);
		setApellidoPaterno(apellidopaterno);
		setApellidoMaterno(apellidomaterno);
		setEdad(edad);
		setPeso(peso);
		setEstatura(estatura);
		setNacionalidad(nacionalidad);
		setRFC(RFC);
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setApellidoPaterno(String apellidopaterno){
		this.apellidopaterno = apellidopaterno;
	
	}
	public void setApellidoMaterno(String apellidomaterno){
		this.apellidomaterno = apellidomaterno;
	
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	
	}
	
	public void setPeso(float peso){
		this.peso = peso;
	
	}
	
	public void setEstatura(float estatura){
		this.estatura = estatura;
	
	}
	public void setNacionalidad(String nacionalidad){
		this.nacionalidad = nacionalidad;
	
	}
	public void setRFC(String RFC){
		this.RFC = RFC;
	
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellidoPaterno(){
		return this.apellidopaterno;
	}
	
	public String getApellidoMaterno(){
		return this.apellidomaterno;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public float getPeso(){
		return this.peso;
	}
	
	public float getEstatura(){
		return this.estatura;
	}
	
	public String getNacionalidad(){
		return this.nacionalidad;
	}
	
	public String getRFC(){
		return this.RFC;
	}
	
}