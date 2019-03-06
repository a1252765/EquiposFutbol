public class Inventario{

	public static void main(String args[]){
		
		dimensionequipos = Captura.capturaDimensionEquipos;
		
		Equipo equipos[dimensionequipos];
		
		for (int i=0; i < dimensionequipos;i++)
			equipos[i] = new Equipo(Captura.capturaNombreEquipo(), Captura.capturaSlogan(), Captura.capturaNumeroJugadores(), Captura.capturaLiga(), Captura.capturaPartidosGanados(), Captura.capturaPartidosPerdidos());
	}

}