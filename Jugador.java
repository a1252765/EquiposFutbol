public class Jugador extends Persona{
	
	
	String posicion;
	int numero;
	int amonestaciones;
	int expulsiones;
	int goles;
	long sueldo;
	boolean seleccionnacional; 
	
	public Jugador( String posicion, int numero, int amonestaciones, int expulsiones, int goles, long sueldo, boolean seleccionnacional){
		
		super(Captura.capturaString("Capture Nombre: "), Captura.capturaString("Capture Apellido Paterno: "), Captura.capturaString("Capture Apellido Materno: "), Captura.capturaInteger("Capture Edad:"), Captura.capturaFloat("Capture Peso: "), Captura.capturaFloat("Capture Estatura: "), Captura.capturaString("Capture Nacionalidad: "), Captura.capturaString("Capture RFC: "));
		
		setPosicion(posicion);
		setNumero(numero);
		setAmonestaciones(amonestaciones);
		setExpulsiones(expulsiones);
		setGoles(goles);
		setSueldo(sueldo);
		setSeleccionNacional(seleccionnacional);
		
	}		
	
	
	
	public void setPosicion(String posicion){
		this.posicion = posicion;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void setAmonestaciones(int amonestaciones){
		this.amonestaciones = amonestaciones;
	}
	
	public void setExpulsiones(int expulsiones){
		this.expulsiones = expulsiones;
	}
	
	public void setGoles(int goles){
		this.goles = goles;
	}
	
	public void setSueldo(long sueldo){
		this.sueldo = sueldo;
	}
	
	public void setSeleccionNacional(boolean seleccionnacional){
		this.seleccionnacional = seleccionnacional;
	}

	
	public String getPosicion(){
		return this.posicion;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public int getAmonestaciones(){
		return this.amonestaciones;
	}
	
	public int getExpulsiones(){
		return this.expulsiones;
	}
	
	public int getGoles(){
		return this.goles;
	}
	
	public long getSueldo(){
		return this.sueldo;
	}
	
	public boolean getSeleccionNacional(){
		return this.seleccionnacional;
	}
		
}