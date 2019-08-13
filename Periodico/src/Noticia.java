
public class Noticia {

	String autor;
	String fecha;
	String titulo;
	String cuerpo;
	
	
	public Noticia(String autor, String fecha, String titulo,String cuerpo) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.fecha = fecha;
		this.cuerpo = cuerpo;
	}


	void ImprimirNoticia() {
		System.out.println("- - - - - - - - - - - ");
		System.out.println(autor + " " + fecha);
		System.out.println(titulo);
		System.out.println(cuerpo);
		System.out.println(" - - - - - - - - - - ");
	}
}
