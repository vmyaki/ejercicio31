
public class Main {

	public static void main(String[] args) {
		
		Planeta planeta1 = new Planeta ("Marte",1000000,'c',3.6f,true);
		Planeta planeta2 = new Planeta ("Plutón",2000000,'c',18.7f,true);
		
				
		//obtenemos y mostramos los datos con el método Get
		
		/*System.out.println("Planeta 1 antes de modificar");
		System.out.println("Nombre: " +planeta1.isNombre());
		System.out.println("Distancia: " +planeta1.isDistancia());
		System.out.println("Elemento: " +planeta1.isElemento());
		System.out.println("Gravedad: " +planeta1.isGravedad()+ " m/s");
		System.out.println("¿Tiene atmósfera? : " +planeta1.isHayAtmosfera());
		
		System.out.println("*************************************");
		System.out.println("Planeta 2 antes de modificar");
		System.out.println("Nombre: " +planeta2.isNombre());
		System.out.println("Distancia: " +planeta2.isDistancia());
		System.out.println("Elemento: " +planeta2.isElemento());
		System.out.println("Gravedad: " +planeta2.isGravedad()+" m/s");
		System.out.println("¿Tiene atmósfera? : " +planeta2.isHayAtmosfera());*/
		
		
		//Modificamos los datos con el método Set
		/*System.out.println("*************************************");
		System.out.println("Planeta 1 despues de modificar");*/
		//Modifcamos el valor de la variable nombre y mostramos con get
		planeta1.setNombre("Jupiter");
		/*System.out.println("Nombre Nuevo: " +planeta1.isNombre());*/
		//Modifcamos el valor de la variable distancia y mostramos con get
		planeta1.setDistancia(300000000);
		/*System.out.println("Distancia Nueva: "+planeta1.isDistancia());*/
		//Modifcamos el valor de la variable elemento y ramos con get
		planeta1.setElemento('s');                      
		/*System.out.println("Elemento Nuevo: "+planeta1.isElemento());*/
		//Modifcamos el valor de la variable gravedad y ramos con get
		planeta1.setGravedad(80.6);                     
		/*System.out.println("Gravedad Nueva: "+planeta1.isGravedad()+" m/s");*/
		//Modifcamos el valor de la variable hay atmosfe mostramos con get
		planeta1.setHayAtmosfera(false);                
		/*System.out.println("¿Tiene atmósfera?: "+planeta1.isHayAtmosfera());*/
                                                        
		System.out.println(planeta1.toString());
		System.out.println(planeta2.toString());

		
	}
	

}
