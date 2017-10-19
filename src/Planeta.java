
public class Planeta {
	//Atributos
	private String nombre;
	private double distancia;
	private char elemento;
	private double gravedad;
	private boolean hayAtmosfera;
	
	//Constructores
	/**
	 * 
	 * @param nombre - representa el nombre del planeta
	 * @param distancia - representa la distancia del planeta
	 * @param elemento - representa el elemento que predomina, carbono o silicio
	 * @param gravedad - representa la gravedad de ese planeta
	 * @param hayAtmosfera - representa si hay oxigeno o no, si hay oxigeno devuelve [x] sino []
	 */
	public Planeta (String nombre,int distancia,char elemento,double gravedad,boolean hayAtmosfera) {
		this.nombre=nombre;
		this.distancia=distancia;
		this.elemento=elemento;
		this.gravedad=gravedad;
		this.hayAtmosfera=hayAtmosfera;
	}
	
	//Métodos

		//Nombre
	public String isNombre() {
		return this.nombre;
	}
	
	public void setNombre (String nombreNuevo) {
		this.nombre =nombreNuevo;
	}
	
		//Distancia
	public double isDistancia() {
		return this.distancia;
			
	}
	
	public void setDistancia(double distanciaNueva) {
		this.distancia=distanciaNueva;
	}
	
		//Elemento
	public char isElemento() {
		return this.elemento;
	}
	
	public void setElemento(char elementoNuevo) {
		this.elemento=elementoNuevo;
		}
	
		//Gravedad
	public double isGravedad() {
		return this.gravedad;
	}
	
	public void setGravedad(double gravedadNueva)
	{
		this.gravedad=gravedadNueva;
	}
	
		//Hay atmósfera
	public boolean isHayAtmosfera() {
			return this.hayAtmosfera;
		}
	
	
	public void setHayAtmosfera(boolean hayAtmosferaNueva) {
		this.hayAtmosfera=hayAtmosferaNueva;
	}
	
	public String toString() {
		String resultado="";
		resultado +="\nNombre: "+this.nombre;
		resultado +="\nDistancia: "+this.distancia;
		if (elemento=='c') {
			resultado += "\nElemento: Carbono";
		}
		else if (elemento=='s') {
			resultado +="\nElemento: Silicio";
		}
		resultado +="\nGravedad: "+this.gravedad;
		if (hayAtmosfera) {
			resultado +="\nHay atmósfera: [x]";
		}
		else {
			resultado +="\nHay atmósfera: []";
		}
		
		return resultado;
	}
	
}
	