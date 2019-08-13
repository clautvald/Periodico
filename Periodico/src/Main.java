
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noticia n = new Noticia ("Clau_tvald", 
								"Hoy", 
								"¡Caos en AQP!", 
								"Sobredosis de programación" );
		Periodico p = new Periodico();
		p.AgregarNoticia(n);
		p.ImprimirPeriodico();
		
	}

}
