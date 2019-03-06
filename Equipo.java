public class Equipo{
	
	String nombreequipo;
	String slogan;
	int numerojugadores;
	String liga;
	int partidosganados;
	int partidosperdidos;
	
	public Equipo(String nombreequipo, String slogan, int numerojugadores, String liga, int partidosganados, int partidosperdidos){
		
		setNombreEquipo(nombreequipo);
		setSlogan(slogan);
		setNumeroJugadores(numerojugadores);
		setLiga(liga);
		setPartidosGanados(partidosganados);
		setPartidosPerdidos(partidosperdidos);
		
		jugadores = new jugadores[numerojugadores];
		
		for(int i=0; i< numerojugadores; i++)
			jugadores[i] = new Jugador(Captura.capturaString("Capture Posicion: "), Captura.capturaNumero(), Captura.capturaAmonestaciones(), Captura.capturaExpulsiones(), Captura.capturaGoles(), Captura.capturaSueldo(), Captura.capturaSeleccionNacional());
	
	}
	
	public void setNombreEquipo(String nombreequipo){
		this.nombreequipo = nombreequipo;
	
	}
	
	public void setSlogan(String slogan){
		this.slogan = slogan;
	}
	
	public void setNumeroJugadores(int numerojugadores){
		this.numerojugadores = numerojugadores;
	}
	
	public void setLiga(String liga){
		this.liga = liga;
	}
	
	public void setPartidosGanados(int partidosganados){
		this.partidosganados = partidosganados;
	}
	
	public void setPartidosPerdidos(int partidosperdidos){
		this.partidosperdidos = partidosperdidos;
	}
	
	public String getNombreEquipo(String nombreequipo){
		return this.nombreequipo;
		
	}
	
	public String getSlogan(String slogan){
		return this.slogan;
	}
	
	public int getNumeroJugadores(int numerojugadores){
		return this.numerojugadores;
	}
	
	public String getLiga(String liga){
		return this.liga;
	}
	
	public int getPartidosGanados(int partidosganados){
		return this.partidosganados;
	}
	
	public int getPartidosPerdidos(int partidosperdidos){
		return this.partidosperdidos;
	}
	
	
	Jugador jugadores[];
	
}