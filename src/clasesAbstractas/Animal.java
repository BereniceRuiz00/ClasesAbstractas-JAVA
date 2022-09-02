package clasesAbstractas;

public abstract class Animal {

	//Atributos	
	String clasificacion;
	
	//Métodos
	public abstract void sonido();
	
	public abstract void desplazarse();
	
	
	//Constructor
	public Animal(String clasificacion) {
		super();
		this.clasificacion = clasificacion;
	}
	
}//Cierre class Animal

////////////////////////////////////////////////////////////

class Oso extends Animal{

	public Oso(String clasificacion) {
		super(clasificacion);
		
	}

	@Override
	public void sonido() {
		System.out.println("El oso hace roarrrrrr!!");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("El oso camina en 4 patas");
		
	}

}
////////////////////////////////////////////////////////////////

class Buho extends Animal{
	
	public Buho(String clasificacion) {
		super(clasificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sonido() {
		System.out.println("El buho hace uu uuu");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("El buho vuela");
	}
			

}
//////////////////////////////////////////////////////////

class Conejo extends Animal {

	public Conejo(String clasificacion) {
		super(clasificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sonido() {
		System.out.println("El conejo chilla");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("El conejo brinca");
		
	}
}
///////////////////////////////////////////////////////////

class Ninfa extends Animal{

	public Ninfa(String clasificacion) {
		super(clasificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sonido() {
		System.out.println("La ninfa canta");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("Las ninfas vuelan");
		
	}
	
}
//////////////////////////////////////////////////////////////

class Caballo extends Animal{

	public Caballo(String clasificacion) {
		super(clasificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sonido() {
		System.out.println("Los caballos relichan");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("EL caballo trota");
		
	}

	@Override
	public String toString() {
		return "Caballo clasificacion =" + clasificacion;
	}
	
	
}
////////////////////////////////////////
class testAnimal {
	public static void main (String args[]) {
		
			Oso Oso = new Oso("omnivoro");
			Conejo Conejo = new Conejo("omnivoro");
			Caballo Caballo = new Caballo("Herviboro");
			Ninfa Ninfa = new Ninfa("Omnivoro");
			Buho Buho = new Buho("Omnivoro");
			
			Oso.desplazarse();
			Oso.sonido();	
			Conejo.desplazarse();
			Conejo.sonido();
			Caballo.desplazarse();
			Caballo.sonido();
			Ninfa.desplazarse();
			Ninfa.sonido();
			Buho.desplazarse();
			Buho.sonido();
	}
	
}






