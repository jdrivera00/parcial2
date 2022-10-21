public class videojuego implements entregable{
 
	private final static int HORAS_ESTIMADAS =10;
	public final static int MAYOR=1;
	public final static int MENOR=-1;
	public final static int IGUAL=0;
 
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
  	private String genero;
  	private String compañia;
 
  	public videojuego(String string, int i, String string2, String string3) {
	}

	public videojuego() {
	}

	public videojuego(String string, String string2) {
	}

	public String getTitulo() {
  		return titulo;
  	}
 
  	public void setTitulo(String titulo) {
	   	this.titulo = titulo;
  	}
 
  	public int getHorasEstimadas() {
  		return horasEstimadas;
  	}
 
  	public void setHorasEstimadas(int horasEstimadas) {
  		this.horasEstimadas = horasEstimadas;
  	}
 
  	public String getGenero() {
  		return genero;
  	}
 
  	public void setGenero(String genero) {
	   	this.genero = genero;
  	}
 
  	public String getcompañia() {
  		return compañia;
  	}
 
  	public void setcompañia(String compañia) {
  		this.compañia = compañia;
  	}
 
   @Override
   public void entregar() {
       entregado=true;
   }
 
   @Override
   public void devolver() {
       entregado=false;
   }
 
   @Override
   public boolean isEntregado1() {
       if(entregado){
           return true;
       }
       return false;
   }

   @Override
   public int compareTo(Object a) {
       int estado=MENOR;
 
       videojuego ref=(videojuego)a;
       if (horasEstimadas>ref.getHorasEstimadas()){
           estado=MAYOR;
       }else if(horasEstimadas==ref.getHorasEstimadas()){
           estado=IGUAL;
       }
 
       return estado;
   }

   @Override
   public String toString(){
       return "Informacion del videojuego: \n" +
               "\tTitulo: "+titulo+"\n" +
               "\tHoras estimadas: "+horasEstimadas+"\n" +
               "\tGenero: "+genero+"\n" +
               "\tcompañia: "+compañia;
   }
 
   public boolean equals(videojuego a){
       if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
           return true;
       }
       return false;
   }
   
@Override
public boolean isEntregado() {
	return entregado;
}

@Override
public void compareTo() {
	
}

}